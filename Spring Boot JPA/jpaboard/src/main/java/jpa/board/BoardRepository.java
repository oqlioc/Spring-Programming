package jpa.board;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.board.model.Board;

 

public interface BoardRepository extends JpaRepository<Board, Integer> {

 

}