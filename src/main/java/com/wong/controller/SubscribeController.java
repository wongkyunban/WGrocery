package com.wong.controller;

import com.wong.bean.User;
import com.wong.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Locale;

@Controller
public class SubscribeController {

    @RequestMapping(value = {"/subscribe"},method = RequestMethod.GET)
    public String subscribe(Model model, Locale locale, HttpServletRequest request) {

        User[] users = {new User("Tom","Football","China"),
        new User("Jhon","Basketball","China"),
        new User("Lucy","Tennis","China")};
        model.addAttribute("users",users);
        return "subscribe";
    }
}
