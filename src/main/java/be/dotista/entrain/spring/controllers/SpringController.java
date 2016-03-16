package be.dotista.entrain.spring.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Dorito on 20-02-16.
 */

@Controller
@RequestMapping("/spring")

public class SpringController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getSpring()
    {
        ModelAndView model = new ModelAndView("greeting");

        return model;
    }

}
