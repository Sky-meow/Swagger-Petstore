package template.controller;

import org.springframework.web.bind.annotation.*;
import template.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping()
    public String CreateOne() {
        return "";
    }

    @PostMapping("/creates")
    public String creates() {
        return "";
    }

    @GetMapping()
    public String one() {
        return "";
    }
}
