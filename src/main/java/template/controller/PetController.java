package template.controller;

import org.springframework.web.bind.annotation.*;
import template.dao.PetMapper;
import template.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetMapper petMapper;

    @PostMapping()
    public String selectAll(){
        return "";
    }
    @PutMapping()
    public String update(){
        return "";
    }
    @GetMapping("/findByStatus")
    public String findByStatus(){
        return "";
    }

}
