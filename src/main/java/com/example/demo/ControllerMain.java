package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //@RequestMapping("/hello")
			@RequestMapping("DemoApplication")
			 public @ResponseBody String home() {

		        return "Hello World by Stephen!";
				
	}

}
	


