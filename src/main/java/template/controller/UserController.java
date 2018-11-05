package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import template.entity.PetUser;
import template.mapper.PetUserMapper;

import java.util.List;

@Controller
@RequestMapping("/d")
public class UserController {
    @Autowired
    PetUserMapper PetUserMapper;

    @ModelAttribute("petList")
    public List<PetUser> initOne() {
        return PetUserMapper.selectAll();
    }

    @GetMapping()
    public String one(Model model) {
        return "UserOne";
    }

    @PostMapping()
    @ResponseBody
    public String insertTwo(@RequestBody List<PetUser> list) {
        int c = 0;
        for (PetUser PetUser:list
             ) {
            c = PetUserMapper.insert(PetUser);
        }
        if (c > 0)
            return "{\"msg\":\"perfect\"}";
        return "{\"msg\":\"fail\"}";
    }
    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") String id) {
        PetUserMapper.deleteByPrimaryKey(Integer.parseInt(id));
        return "UserOne";
    }
    @PostMapping("/upda")
    public String upda(PetUser e) {
        PetUserMapper.updateByPrimaryKey(e);
        return "UserOne";
    }
}
