package com.example.OAuthGitHub.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller  
public class WebController {  

    @RequestMapping("/Auth_GitHub")  
    public String auth_GitHub(Model model,
    						  @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,  
                              @AuthenticationPrincipal OAuth2User oauth2User,
                              HttpServletRequest request) {  
    	HttpSession session = request.getSession(true);
    	session.setAttribute("user",oauth2User);
    	return "redirect:" + "home";
    }   
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
    	HttpSession session = request.getSession(false);
    	if (session.getAttribute("user") != null) {
    		OAuth2User user = (OAuth2User) session.getAttribute("user");
        	model.addAttribute("userName", user.getName());  
            model.addAttribute("userAttributes", user.getAttributes()); 
        	return "home";
    	} else {
    		return "home";
    	}
    	
    }
    
    
    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String login() {
      return "login.html";
    }
    
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    public void loginPost() {
      login();
    }
}
