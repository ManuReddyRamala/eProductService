package com.example.fakestore;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manuapi")
public class Controller {

   @RequestMapping("/hello")
    public String hello() {
        return "Hello from Manu";
    }
    @RequestMapping("/bye/{name}")
    public String bye(@PathVariable String name)
    {
        return "Bye "+name;
    }
    public void add()
    {

    }
}
