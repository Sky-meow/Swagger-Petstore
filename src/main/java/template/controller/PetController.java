package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import template.entity.PetPet;
import template.mapper.PetPetMapper;

import java.util.List;

@Controller
@RequestMapping("/a")
public class PetController {
    @Autowired
    PetPetMapper petPetMapper;

    @ModelAttribute("petList")
    public List<PetPet> initOne() {
        return petPetMapper.selectAll();
    }

    @GetMapping()
    public String one(Model model) {
        return "petOne";
    }

    @PostMapping()
    @ResponseBody
    public String insertTwo(@RequestBody List<PetPet> list) {
        int c = 0;
        for (PetPet petPet:list
             ) {
            c = petPetMapper.insert(petPet);
        }
        if (c > 0)
            return "{\"msg\":\"perfect\"}";
        return "{\"msg\":\"fail\"}";
    }
    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") String id) {
        petPetMapper.deleteByPrimaryKey(Integer.parseInt(id));
        return "petOne";
    }
    @PostMapping("/upda")
    public String upda(PetPet e) {
        petPetMapper.updateByPrimaryKey(e);
        return "petOne";
    }
}
