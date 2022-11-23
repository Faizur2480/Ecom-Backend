package com.Webapp.miniproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
  @GetMapping("/")
  public String devLearn() {
	  return "API Deployed Successful";
  }

}
