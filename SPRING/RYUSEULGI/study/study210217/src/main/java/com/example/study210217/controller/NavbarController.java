package com.example.study210217.controller;

import com.example.study210217.entity.Member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class NavbarController {
    private static final Logger log = LoggerFactory.getLogger(NavbarController.class);

    @GetMapping("main")
    public String getMain() {
        log.info("getMain()");

        return "nav/navbar";
    }

    @RequestMapping(value = "main", method = RequestMethod.GET, params = "signup")
    public String getSignup(Model model) {
        log.info("getSignup()");

        model.addAttribute("member", new Member());
        return "nav/signup";
    }

    @PostMapping("welcome")
    public String getWelcome(Member member, Model model) {
        log.info("getWelcome()");
        log.info("userEmail : " + member.getUserEmail());
        log.info("userPw : " + member.getUserPw());
        log.info("userPhoneNumber : " + member.getUserPhoneNumber());

        model.addAttribute("email", member.getUserEmail());
        return "nav/welcome";
    }
}
