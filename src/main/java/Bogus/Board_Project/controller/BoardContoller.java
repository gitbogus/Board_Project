package Bogus.Board_Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardContoller {
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }
}
