package com.junrdev.shop.admin.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String HomePage(){return "index";}
}
