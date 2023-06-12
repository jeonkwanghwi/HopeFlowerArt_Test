package kh.kwanghwi.board.domain.repository;

import kh.kwanghwi.board.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}