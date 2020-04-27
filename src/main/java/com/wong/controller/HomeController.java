package com.wong.controller;

import com.wong.bean.User;
import com.wong.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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
public class HomeController{

    @RequestMapping(value = {"/home"},method = RequestMethod.GET)
    public String getHomePage(Model model, Locale locale, HttpServletRequest request) {
        // ${x}
        model.addAttribute("userName","Tome");
        // ${param.x}
        UserBean userBean = new UserBean("Tome","IT Designer","play video game");
        model.addAttribute("userBean",userBean);

        // ${session.x}
        HttpSession session=request.getSession();//获取session并将mark存入session对象
        session.setAttribute("mark", "欢迎大驾光临！");

        // ${application.x}
        ServletContext application = request.getServletContext();//获取ServletContext并将remark存入ServletContext对象
        application.setAttribute("remark","ByeBye!");

        String[] hobbies = {"game","football","ice"};
        model.addAttribute("hobbies",hobbies);
        model.addAttribute("today",new Date());
        User user = new User("Tom","Wong","China");
        session.setAttribute("user",user);
        return "home";
    }
}
