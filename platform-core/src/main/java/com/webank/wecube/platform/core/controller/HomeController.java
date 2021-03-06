package com.webank.wecube.platform.core.controller;

import static com.webank.wecube.platform.core.domain.JsonResponse.*;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webank.wecube.platform.core.domain.JsonResponse;
import com.webank.wecube.platform.core.service.MenuService;

@Controller
@RequestMapping("/v1")
public class HomeController {

    @Autowired
    private MenuService menuService;

    @GetMapping(value = { "/", "index.html" })
    public String index() {
        return "index.html";
    }

    @GetMapping(value = { "login.html" })
    public String loginPage() {
        return "login.html";
    }

    @GetMapping(value = {"/home"})
    public String home(Model model, Principal principal) {
        model.addAttribute("system_name", "Wecube Core");
        model.addAttribute("login_user", principal.getName());
        return "home.html";
    }

    @GetMapping("/my-menus")
    @ResponseBody
    public JsonResponse getMyMenuItems(Principal principal) {
        return okay().withData(menuService.getAllMenus());
    }

    @GetMapping("/all-menus")
    @ResponseBody
    public JsonResponse getAllMenuItems(Principal principal) {
        return okay().withData(menuService.getAllMenus());
    }
}
