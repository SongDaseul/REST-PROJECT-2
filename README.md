# REST-PROJECT-2

# 실행 준비
1. JDK(jdk1.8.0_241), Eclipse(eclipse-jee-2019-12-R-win32-x86_64) 설치 후 시스템 환경 변수 접속
2. 시스템 환경 변수 JAVA_HOME(C:\Program Files\Java\jdk1.8.0_241)을 추가한 뒤 path에 (%JAVA_HOME%\bin) 추가
3. Eclipse에 접속하여 Help - Eclipse Marketplace - 'Spring Tool 4.5.1.RELEASE' install
4. Mysql(mysql-installer-community-8.0.15.0) 설치 후 schema name : 'nice' , db name : 'dorim' 테이블 생성 (create.sql 파일 참고)
5. github에서 Clone or download 후 로컬 eclipse-workspace 폴더에 저장
6. 다시 Eclipase에 접속하여 import - Existing Projects into Workspace로 'RestProject' import
7. RestProject/src/main/resources/application.properties파일에서 username, password DB 정보에 알맞게 변경
8. RestProject 우 클릭 - Run As - Maven build

# 명령어로 실행
1. cmd를 키고 jar 파일이 생성된 위치로 이동
2. 'java -jar 'jar 파일이 생성된 위치'/RestProject-0.0.1-SNAPSHOT.jar' 명령 실행
<img width="734" alt="run" src="https://user-images.githubusercontent.com/50701343/81380863-91518b00-9146-11ea-9639-d48599270169.PNG">


# 배치 프로그램으로 실행
1. text 파일에 아래 내용 기입 후 저장 ( ANSI, all files, file name -RestProject.bat )
```
java -jar 'jar 파일이 생성된 위치'/RestProject-0.0.1-SNAPSHOT.jar
pause>nul
```
2. RestProject.bat 더블 클릭
<img width="732" alt="bat run" src="https://user-images.githubusercontent.com/50701343/81380686-3ddf3d00-9146-11ea-9c9e-0340ba62ddca.PNG">


# 실행 결과
1. http://localhost:8080/dorim => json 그대로 보여주는 화면

2. http://localhost:8080/index.html => ajax로 '/dorim' url을 통해 json 데이터를 받아 html로 보여주는 화면


# 실행 결과 화면

<img width="960" alt="Springboot구동" src="https://user-images.githubusercontent.com/50701343/76092834-6d1ce500-6003-11ea-9944-f26e2fe26dcd.PNG">


<img width="736" alt="db" src="https://user-images.githubusercontent.com/50701343/76092938-8e7dd100-6003-11ea-86de-d2e16fc87c8a.PNG">


<img width="960" alt="json1" src="https://user-images.githubusercontent.com/50701343/76093038-b4a37100-6003-11ea-9acb-217a5023e808.PNG">


<img width="960" alt="html2" src="https://user-images.githubusercontent.com/50701343/76093021-ace3cc80-6003-11ea-8ce6-60a3cc90bf17.PNG">
<img width="960" alt="html3" src="https://user-images.githubusercontent.com/50701343/76093116-cdac2200-6003-11ea-9220-2f0d5c7f2e1c.PNG">

# json DB 저장 (RestProjectApplication.java)
<img width="551" alt="json저장" src="https://user-images.githubusercontent.com/50701343/76094079-5d060500-6005-11ea-891b-2dce56c4ee4d.PNG">

# Ajax GET(/dorim) in index.html
<img width="446" alt="ajax" src="https://user-images.githubusercontent.com/50701343/76094029-4bbcf880-6005-11ea-9d6b-bea973687a24.PNG">

