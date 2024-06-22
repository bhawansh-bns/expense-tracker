package org.bns;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello, World from SpringBoot";
    }
}
