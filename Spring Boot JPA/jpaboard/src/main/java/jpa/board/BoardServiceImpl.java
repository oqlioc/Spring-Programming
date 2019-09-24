package jpa.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import jpa.board.model.Board;

@Service

public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepository;

	@Override
	public Page<Board> findAll(Integer curPage) {
		PageRequest pr = new PageRequest(curPage, 5, new Sort(new Order(Direction.DESC, "reply"), new Order(Direction.ASC, "replystep")));
		return boardRepository.findAll(pr);
	}
	
	//---------------------------------------------
    // 글 쓰기
    //---------------------------------------------
	@Override
	public void create(Board board) {
		boardRepository.save(board);
	}
	
    //-----------------------------------------
    // 글 삭제
    //-----------------------------------------
	@Override
    public void delete(Integer id) {        
		boardRepository.deleteById(id);
    }
	
	//-----------------------------------------
	// 글 수정
	//-----------------------------------------
	@Override
	public void update(Board board, Integer id) {
		board.setId(id);
		boardRepository.save(board);
	}
	
	 
	


}