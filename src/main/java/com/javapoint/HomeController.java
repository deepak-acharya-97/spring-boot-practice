package com.javapoint;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {
	public String name;
    @RequestMapping("/hello")  
    public String hello(){  
        return this.name == null ? "Name isn't set": this.name;
    }
    @RequestMapping(value="/homepage")
    public void StoreName(String name)
    {
    	this.name=name;
    }
}