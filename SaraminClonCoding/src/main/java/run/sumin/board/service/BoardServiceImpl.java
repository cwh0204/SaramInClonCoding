package run.sumin.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import run.sumin.board.mapper.BoardMapper;
import run.sumin.dto.BoardDTO;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardMapper mapper;
	
	@Override
	public int insertBoard(BoardDTO boardDTO) {
		return mapper.insertBoard(boardDTO);
	}

	@Override
	public BoardDTO selectBoardDetail(int jobId) {
		return mapper.selectBoardDetail(jobId);
	}

	@Override
	public List<BoardDTO> selectBoardList() {
		
		return mapper.selectBoardList();
	}
	
}
