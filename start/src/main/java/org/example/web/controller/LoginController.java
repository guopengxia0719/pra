package org.example.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ApiOperation(value = "登录接口", produces = "application/json")
    public String ajaxLogin(Model model) {
        model.addAttribute("name", "Tome");
        return "login";
    }
}
