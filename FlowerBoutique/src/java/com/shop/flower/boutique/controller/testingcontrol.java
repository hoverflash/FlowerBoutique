package com.shop.flower.boutique.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author faisalhadi
 */
@Controller
public class testingcontrol {

//    @Autowired
//    QueryHelper queryhelper;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView IndexController() {

        ModelAndView mav = new ModelAndView("index");
        System.out.println("OKE SUCCESS");
//    List<Category> cat = queryhelper.getCategory(String.valueOf(1));
//    System.out.println(cat.get(0).getName());
//    System.out.println(cat.get(0).getDescription());


        return mav;


    }
}