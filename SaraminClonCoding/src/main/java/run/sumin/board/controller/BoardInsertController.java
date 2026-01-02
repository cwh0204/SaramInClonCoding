package run.sumin.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import run.sumin.board.service.BoardService;
import run.sumin.dto.BoardDTO;

@Controller
@RequiredArgsConstructor
public class BoardInsertController {
	
	private final BoardService service;
	
	@PostMapping("/board/insert")
	@ResponseBody
	public int boardInsert(BoardDTO board) {
		return service.insertBoard(board);
	}
}
