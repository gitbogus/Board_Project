package Bogus.Board_Project.controller;

import Bogus.Board_Project.dto.CommentDTO;
import Bogus.Board_Project.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/save")
    public @ResponseBody String save(@ModelAttribute CommentDTO comentDTO){
        System.out.println("comentDTO = " + comentDTO);
        return "요청 성공";
    }
}
