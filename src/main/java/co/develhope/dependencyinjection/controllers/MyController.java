package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {

    private MyService service;

    @Autowired
    public MyController(MyService service) {
        System.out.println("MyController constructor has been called");
        this.service = service;
    }

    @GetMapping("/")
    public String welcomeMsg(){
        return "Hello, thanks for visiting us!";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

}
