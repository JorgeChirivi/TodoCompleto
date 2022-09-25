package com.ciclo3.TodoCompleto.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping
    public String  index(){
        return  "index";
    }
}
