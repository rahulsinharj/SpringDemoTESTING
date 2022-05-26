package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/do")
    public String doSomething()
    {
        return "RahulkSinha is my name ok Sinha ji !";
    }

    public String mustDo()
    {
        return "RahulSinha you must do these things";
    }
}
