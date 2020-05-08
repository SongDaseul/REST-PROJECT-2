package com.rest;


import com.rest.model.Dorim;
import com.rest.repository.DorimRepository;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class RestProjectApplication {
	
    @Autowired
    private DorimRepository dorimRepository; 
    
    @Bean
    public ApplicationRunner appRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
            	JSONParser parser = new JSONParser();
            	
            	
            	String path = "/dorimdong.json";
        		FileInputStream fileInputStream = new FileInputStream(path);
        		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "EUC-KR");
        		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        		// 1. json 파일을 읽어오는데 나름 데이터 크기가 있으니까 속도가 빠른 BufferedReader를 이용해준다.
        		
        		Object obj = parser.parse(bufferedReader);
        		JSONObject jsonObject = (JSONObject) obj;
        		JSONArray jsonArray = (JSONArray) jsonObject.get("Data"); 
        		// 2. json 내용 중에서 Data의 값만 가져온다. msg -> jsonArray 바꿈

        		//String data = msg.toJSONString(); -> 삭제
        		//JSONArray jsonArray = (JSONArray) parser.parse(data); -> 삭제
        		//JSONArray jsonArray = msg; -> 임시
        		
        		for(int i=0;i<jsonArray.size();i++) { // msg -> jsonArray 바꿈

        			JSONObject object = (JSONObject) jsonArray.get(i);

            		Set key = object.keySet();
            		Iterator it = key.iterator();
  
            		Dorim target = new Dorim();
                    Class targetClass = Class.forName("com.rest.model.Dorim");
                    Method methods[] = targetClass.getDeclaredMethods();
                    
                    while(it.hasNext()){

                    	Object itname = it.next();
                    	String name = itname.toString();
            			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            			String func_name = "set"+name;

                        for(int j=0;j<methods.length;j++) {
                        	String findMethod = methods[j].getName();
 
                            if(findMethod.equals(func_name) && findMethod != "setId") {
                                try {

                            	methods[j].invoke(target, object.get(itname.toString()).toString());

                                }catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }catch(IllegalArgumentException e) {
                                	e.printStackTrace();
                                }catch(InvocationTargetException e){
                                	e.printStackTrace();
                                }catch(IllegalStateException e) {
                                	e.printStackTrace();
                                }catch(NoSuchElementException e) {
                                	e.printStackTrace();
                                }

                            }//if
                        }//for
            		
                    }//while
                    target.setId(i+1);
                    dorimRepository.save(target);
        		}//for
                       
            }
        };
    }
    
    public static void main(String[] args) {
        SpringApplication.run(RestProjectApplication.class, args);
    }
}
