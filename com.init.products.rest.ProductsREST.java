package com.init.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class ProductsREST {

    @GetMapping //localhost:8080
    @RequestMapping(value=/lista.json , method=RequestMethod.GET)
    public string hello(){                
    	return "Hello world";
    }
}