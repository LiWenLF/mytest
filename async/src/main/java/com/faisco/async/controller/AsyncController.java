package com.faisco.async.controller;

import com.faisco.async.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/page")
    public String async() {
        System.out.println("报表请求线程" + Thread.currentThread().getName());
        asyncService.generateReport();
        return "async";
    }
}
