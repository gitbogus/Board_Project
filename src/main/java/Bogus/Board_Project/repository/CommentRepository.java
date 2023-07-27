package Bogus.Board_Project.repository;

import Bogus.Board_Project.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
