package Bogus.Board_Project.repository;

import Bogus.Board_Project.entity.BoardEntity;
import Bogus.Board_Project.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);
}
