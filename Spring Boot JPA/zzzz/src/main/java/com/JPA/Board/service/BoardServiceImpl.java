package com.JPA.Board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Board.model.Board1;
import com.JPA.Board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardRepository boardRepository;

	@Override
	public List<Board1> findAll() {
		return  boardRepository.findAll();
	}

	@Override
	public void save(Board1 board1) {
		boardRepository.save(board1);
	}

}
