package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController
{
@Autowired
User user;
    @GetMapping("/")
    public String user(Model model)
    {

        user.setUserName("sowmya");
        String msg="Welcome to stackroute " +user.getUserName();
        model.addAttribute("msg", msg);
        return "index";
    }
}