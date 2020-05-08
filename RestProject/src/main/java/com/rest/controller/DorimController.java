package com.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.model.Dorim;
import com.rest.repository.DorimRepository;


@RestController
public class DorimController {

    @Autowired
    private DorimRepository dorimrepository;

    @RequestMapping("/dorim")
    public List<Dorim> getDorims() {
        return dorimrepository.findAll();
    }
    
}
