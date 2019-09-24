package com.JPA.Board.service;

import java.util.List;

import com.JPA.Board.model.Board1;

public interface BoardService {
	//게시판 리스트 보기
	public List<Board1> findAll();
	//게시판 글쓰기
	public void save(Board1 board1);
}
