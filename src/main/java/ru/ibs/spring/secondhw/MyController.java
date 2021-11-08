package ru.ibs.spring.secondhw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/mvc")
public class MyController {
    private final static String CONST_PETROL = "petrol";
    private final static String CONST_DIESEL = "diesel";
    private BeansCla beansCla;
    HashMap<String, Engine> engineHashMap = beansCla.BeansCla();

    @GetMapping("/fuel")
    @AnnotFuelExceptionHandle
    public String myMeth(
            @RequestParam(name="type",required = false,defaultValue = "Какое-то топливо")
            String name, Model model){

        if(CONST_PETROL.equals(name)){
            model.addAttribute("я работаю на",engineHashMap.get("petrol").powerUp());


        }else if(CONST_DIESEL.equals(name)) {
            Diesel diesel = new Diesel();
            model.addAttribute("я работаю на", engineHashMap.get("diesel").powerUp());
        };
        return "myMeth";
    }

    @GetMapping("/messError")
    public String myMethError(String name, Model model){
        model.addAttribute("name",name);
        return "/messError";
    }
}
