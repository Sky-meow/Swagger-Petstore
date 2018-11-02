package template.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.LocaleResolver;
import template.entity.Category;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Locale;

@Controller
@RequestMapping("/index.jsp")
public class userController {

    @RequestMapping(method = RequestMethod.GET)
    public String testOne(){
        return "book_input";
    }

    @RequestMapping(value = "/r",method = RequestMethod.POST)
    public String testO2 (@Valid Category category, BindingResult result){

        return "book_input";
    }
    @Autowired
    private LocaleResolver localeResolver;

    @GetMapping("/cl/{loc}")
    public String changeLocale (@PathVariable("loc") String localeStr, HttpServletRequest req, HttpServletResponse resp) {
        Locale locale = new Locale(localeStr);
        localeResolver.setLocale(req, resp, locale);
        return "book_input";
    }
}
