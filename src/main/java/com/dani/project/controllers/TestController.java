package com.dani.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
   
   @RequestMapping("/project-spring")
   public String Test() {
      return "Project - Spring";
   }

}
