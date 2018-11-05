package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import template.entity.PetCategory;
import template.entity.PetPet;
import template.mapper.PetCategoryMapper;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/b")
public class CategoryController {
    @Autowired
    PetCategoryMapper petCategoryMapper;

    @ModelAttribute("categoryList")
    public List<PetCategory> initOne() {
        return petCategoryMapper.selectAll();
    }

    @GetMapping()
    public String one(Model model) {
        return "categoryOne";
    }

    @PostMapping()
    @ResponseBody
    public String insertTwo(@RequestBody List<PetCategory> list) {
        int c = 0;
        for (PetCategory petCategory:list
             ) {
            c = petCategoryMapper.insert(petCategory);
        }
        if (c > 0)
            return "{\"msg\":\"perfect\"}";
        return "{\"msg\":\"fail\"}";
    }
    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") String id) {
        petCategoryMapper.deleteByPrimaryKey(Integer.parseInt(id));
        return "categoryOne";
    }
    @PostMapping("/upda")
    public String upda(PetCategory e) {
        petCategoryMapper.updateByPrimaryKey(e);
        return "categoryOne";
    }
}
