package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import template.entity.PetOrder;
import template.entity.PetPet;
import template.mapper.PetOrderMapper;
import template.mapper.PetPetMapper;

import java.util.List;

@Controller
@RequestMapping("/c")
public class OrderController {
    @Autowired
    PetOrderMapper petOrderMapper;

    @ModelAttribute("petList")
    public List<PetOrder> initOne() {
        return petOrderMapper.selectAll();
    }

    @GetMapping()
    public String one(Model model) {
        return "orderOne";
    }

    @PostMapping()
    @ResponseBody
    public String insertTwo(@RequestBody List<PetOrder> list) {
        int c = 0;
        for (PetOrder petOrder:list
             ) {
            c = petOrderMapper.insert(petOrder);
        }
        if (c > 0)
            return "{\"msg\":\"perfect\"}";
        return "{\"msg\":\"fail\"}";
    }
    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") String id) {
        petOrderMapper.deleteByPrimaryKey(Integer.parseInt(id));
        return "orderOne";
    }
    @PostMapping("/upda")
    public String upda(PetOrder e) {
        petOrderMapper.updateByPrimaryKey(e);
        return "orderOne";
    }
}
