package com.shop.flower.boutique.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.shop.flower.botique.query.QueryHelper;
import com.shop.flower.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author faisalhadi
 */
@Controller
public class IndexController {

    @Autowired
    QueryHelper queryhelper;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView IndexController() {

        Customer cust = queryhelper.getCustomerbyid(1);
        System.out.println("Cust Name " + cust.getFirstName());
        System.out.println("Cust Email " + cust.getEmail());
        
        ModelAndView mav = new ModelAndView("index");
        System.out.println("OKE SUCCESS");
//    List<Category> cat = queryhelper.getCategory(String.valueOf(1));
//    System.out.println(cat.get(0).getName());
//    System.out.println(cat.get(0).getDescription());


        return mav;


    }
}