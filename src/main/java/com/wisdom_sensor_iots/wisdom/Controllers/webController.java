package com.wisdom_sensor_iots.wisdom.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class webController {

    @RequestMapping(value = {"/user", "/"})
    public ModelAndView user(Model model) {
        ModelAndView modelAndView = new ModelAndView("user");
        return modelAndView;
    }
}
