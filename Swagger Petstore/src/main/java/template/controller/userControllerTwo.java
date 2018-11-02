package template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/in.jsp")
public class userControllerTwo {

    @RequestMapping( value = "/category",method = RequestMethod.GET)
    @ResponseBody
    public void testOne(String i ){
        System.out.println(i);
        System.out.println("56");
    }
}
