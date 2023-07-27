package Bogus.Board_Project.controller;

import Bogus.Board_Project.dto.CommentDTO;
import Bogus.Board_Project.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/save")
    public ResponseEntity save(@ModelAttribute CommentDTO commentDTO){
        System.out.println("comentDTO = " + commentDTO);
        Long saveResult = commentService.save(commentDTO);
        if (saveResult != null){
            // 작성 성공하면 댓글 목록을 가져와서 리턴
            // 댓글목록: 해당 게시글의 댓글 전체
            List<CommentDTO> commentDTOList = commentService.findAll(commentDTO.getBoardId());
            return new ResponseEntity<>(commentDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("해당 게시글이 존재하지 않습니다.", HttpStatus.NOT_FOUND);
        }
//        commentService.save(commentDTO);
//        return "요청 성공";
    }
}
