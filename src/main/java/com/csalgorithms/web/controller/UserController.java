package com.csalgorithms.web.controller;

import com.csalgorithms.web.helper.TemplateHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user/add")
    public String add(Model model) {
        return TemplateHelper.view(model, "user", "add");
    }
}
