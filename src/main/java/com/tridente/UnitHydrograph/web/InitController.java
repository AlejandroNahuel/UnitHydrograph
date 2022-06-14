package com.tridente.UnitHydrograph.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitController {
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
