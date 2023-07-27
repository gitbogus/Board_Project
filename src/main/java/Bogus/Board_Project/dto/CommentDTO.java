package Bogus.Board_Project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    private LocalDateTime commentCreatedTime;
}
