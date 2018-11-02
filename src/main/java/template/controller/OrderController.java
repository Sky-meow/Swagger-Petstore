package template.controller;

import org.springframework.web.bind.annotation.*;
import template.entitys.Order;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping()
    public String indexOne(){
        return "index";
    }
    @PostMapping("/seek")
    public String selectOne(Order order){
        System.out.println(order);
        return "";
    }
    @PostMapping("/seeks")
    public String selectTwo(Order order, BindingResult br){
        System.out.println(order);
        return "";
    }

}
