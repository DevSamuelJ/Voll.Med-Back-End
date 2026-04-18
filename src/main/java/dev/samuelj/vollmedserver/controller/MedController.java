package dev.samuelj.vollmedserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MedController {

    @GetMapping("/med")
    public String testeController(){
        return "ok!";
    }
}
