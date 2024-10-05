package com.sandaltreesoft.cicd.github.elasticbeanstalk;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {

    @GetMapping
    public String greet()
    {
        return "Hello from elastic bean stalk";//comment
    }
}
