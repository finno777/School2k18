package com.tsystems.school.controller;


import com.tsystems.school.model.User;
import com.tsystems.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String main(ModelMap modelMap) {
        modelMap.addAttribute("user",userService.findUserById(8L));
        modelMap.addAttribute("users",userService.findAllUsers());
        return "main";
    }


}
