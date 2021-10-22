package com.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHuman {

	public static void main(String[] args) {
		SpringApplication.run(HelloHuman.class, args);
	}
	String name = null;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index (@RequestParam(value="name", required = false) String name) {
    	System.out.println(name);
        if(name == null) {
        	
        	return "<h2>" + "Hello Human!" + "<h2>" + "<h3> Welcome to SpringBoot <h3>";
        }
        else {
        	return "<h2>" + "Hello " + name + "!" + "<h2>" + "<h3> Welcome to SpringBoot <h3>";
        }
    }

}
