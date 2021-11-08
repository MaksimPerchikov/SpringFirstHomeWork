package ru.ibs.spring.secondhw;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mvc")
public class MyController {

    @GetMapping("example")
    public String getExample(){
        return "example";
    }
}

