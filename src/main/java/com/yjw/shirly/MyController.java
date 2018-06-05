package com.yjw.shirly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by caowentao on 2017/2/28.
 */
@Controller
public class MyController {
    @Autowired
    FakeData fakeData;
    @ResponseBody
    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "hello, " + name;
    }

    @GetMapping("/index")
    public String index(Model model, @RequestParam("title") String title){
        ArrayList<String> list = fakeData.getList();
        model.addAttribute("title",title);
        model.addAttribute("list",list);
        return "index";
    }

}