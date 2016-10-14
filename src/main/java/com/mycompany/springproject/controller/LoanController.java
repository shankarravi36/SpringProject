/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.controller;

import com.mycompany.springproject.entity.Customer;
import com.mycompany.springproject.iservice.ICustomerSrv;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Training
 */
@Controller
public class LoanController {
    @Autowired
    private ICustomerSrv customerSrv;
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String showDetails(ModelMap model){
        return "login";
    }
    @RequestMapping(value="/loanValidation", method=RequestMethod.GET)
    public String showLoanValidation(ModelMap model){
        return "loanValidation";
    }
    
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String customerDetails(ModelMap model, 
                                  HttpSession httpSession,
                                   String Name, 
                                  String Email) {
        Customer customer= customerSrv.validateCustomer(Name, Email);
        System.out.println("xxx");
        if(customer!=null){
            System.out.println("customer found");
            httpSession.setAttribute("customer", customer);
           // model.addAttribute("message","Login Successful!");
            return "customer";
        }
        else
        {
        //model.addAttribute("message","Login credentials are not valid");
        return "login";
        }
    }
    
    
    @RequestMapping (value="/loanValidation", method=RequestMethod.POST)
    public String validateBySalary(ModelMap model, 
                                  HttpSession httpSession,
                                  int customerSalary,int loanAmount ){
                               
            String result= customerSrv.validateLoanBySalary(customerSalary, loanAmount);
            if("true".equals(result)){
               // model.addAttribute("message", "customer is eligible for loan");
                return "redirect:/createOrRetrieveLoan";
            }
            else{
                //model.addAttribute("message","customer is not eligible for loan");
                return "redirect:/loanValidation";
            }
    }
    
    
}
