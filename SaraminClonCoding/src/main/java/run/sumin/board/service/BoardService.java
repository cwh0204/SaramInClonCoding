package run.sumin.board.service;

import java.util.List;

import run.sumin.dto.BoardDTO;

public interface BoardService {
	
	int insertBoard(BoardDTO boardDTO);
	
	BoardDTO selectBoardDetail(int jobId);
	
	List<BoardDTO> selectBoardList();
}
