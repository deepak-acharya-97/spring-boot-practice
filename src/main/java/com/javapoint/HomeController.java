package com.javapoint;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {
	public String name;
    @RequestMapping("/hello")  
    public String hello(){  
        String name=this.name == null ? "Name isn't set": this.name;
        return "<h1 style='text-align:left; font-size: 20px;'>Hello "+name+"!</h1>";
    }
    @RequestMapping(value="/homepage")
    public String StoreName(String name)
    {
    	this.name=name;
    	return "<h3>Setting Name = "+name+"In Server</h3>";
    }
}