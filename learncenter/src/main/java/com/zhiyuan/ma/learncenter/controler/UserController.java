package com.zhiyuan.ma.learncenter.controler;

import com.zhiyuan.ma.learncenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


   @Autowired
   private UserService userService;

   @RequestMapping(value="/getUser")
   public String getUser(){

      userService.getUserById();
      return null;
   }

}
