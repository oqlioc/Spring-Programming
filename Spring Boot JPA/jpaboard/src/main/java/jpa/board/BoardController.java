package jpa.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jpa.board.model.Board;

@RestController
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService boardService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("board");
	}

	// ---------------------------------------------
	// 게시판 리스트 보기
	// ---------------------------------------------
	@RequestMapping(value = "/{curPage}", method = RequestMethod.GET)
	public ResponseEntity<Page<Board>> list(Model model, Pageable pageable, @PathVariable Integer curPage) {
		Page<Board> page = boardService.findAll(curPage);
		return new ResponseEntity<Page<Board>>(page, HttpStatus.OK);
	}
	
	//---------------------------------------------
    // 게시판 글 쓰기
    //---------------------------------------------
    @RequestMapping(value="/", method = RequestMethod.POST)
    public ResponseEntity<Void> save(@RequestBody Board board) {               
    	boardService.create(board);
    	return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
	//---------------------------------------------
    // 게시판 글 삭제
    //---------------------------------------------
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {                 
    	boardService.delete(id);
    	return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
	//---------------------------------------------
    // 게시판 글 수정
    //---------------------------------------------
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Board> delete(@RequestBody Board board, @PathVariable Integer id) {                  
    	boardService.update(board, id);
    	return new ResponseEntity<Board>(board, HttpStatus.OK);
    }         

}