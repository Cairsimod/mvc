package com.aust.mvc.controller;

import com.aust.mvc.service.IUserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private IUserOrderService orderService;

    @Autowired
    public HomeController(IUserOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/wel")
    public String welcome(){
        orderService.placeOrder("user_1001","order_1001",3600.20);
        return "welcome";
    }
}
