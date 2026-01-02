package run.sumin.board.mapper;

import java.util.List;

import run.sumin.dto.BoardDTO;

public interface BoardMapper {
	int insertBoard(BoardDTO boardDTO);
	
	BoardDTO selectBoardDetail(int jobId);
	
	List<BoardDTO> selectBoardList();
}
