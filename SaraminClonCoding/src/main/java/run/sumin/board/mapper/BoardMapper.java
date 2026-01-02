package run.sumin.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import run.sumin.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	
	int insertBoard(BoardDTO boardDTO);
	
	BoardDTO selectBoardDetail(int jobId);
	
	List<BoardDTO> selectBoardList();
}
