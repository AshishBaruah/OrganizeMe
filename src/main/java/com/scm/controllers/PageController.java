package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    //  to handle request
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page Handler");

        //  sending data to view
        model.addAttribute("name","Google Corporation");
        model.addAttribute("YoutubeChannel","Learn Code with Ashish");
        model.addAttribute("GithubRepo", "https://github.com/AshishBaruah/OrganizeMe");

        //  key value pairs
        return "home";
    }
}
