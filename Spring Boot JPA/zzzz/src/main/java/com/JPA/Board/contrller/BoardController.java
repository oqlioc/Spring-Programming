package com.JPA.Board.contrller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.JPA.Board.model.Board1;
import com.JPA.Board.repository.BoardRepository;
import com.JPA.Board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	@Autowired
	BoardRepository boardRepository;

	// 루트요청(localhost:8080/board/)시 리스트 보기로
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/board/main";
	}

	// 게시판 리스트 보기
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	// 게시판 리스트 보기
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Board1> list = boardService.findAll();
		System.out.println("list");
		model.addAttribute("list", list);
		return "list";
	}
	// 게시판 글쓰기 창으로 가기
	@RequestMapping(value = "/writeform", method = RequestMethod.GET)
	public String writeform() {
		return "writeform";
	}
	// 게시판 글쓰기
	@RequestMapping(value = "/write")
	public String write(Board1 board1) {
		boardService.save(board1);
		return "redirect:/board/list";
	}
	

}
