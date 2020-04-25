package ru.func.takiwadai.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ArchiveController {
    @GetMapping("/archive")
    public String archive() {
        return "archive";
    }


}
