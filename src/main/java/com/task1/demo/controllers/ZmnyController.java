package com.task1.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZmnyController
{
    @RequestMapping("/all")
    public String all ()
    {

       return "tourism";
    }



}
