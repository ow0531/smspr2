package com.example.smspr2.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbpost")
@Controller
public class TbpostController {
    @GetMapping("/{page}")
    public String create(@PathVariable String page){
        return "tbpost/" + page;
    }
}
