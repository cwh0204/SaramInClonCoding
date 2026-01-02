package run.sumin.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import run.sumin.board.service.BoardService;

@Controller
@RequiredArgsConstructor
public class BoardListController {
	
	private final BoardService service;
	
	@GetMapping("/board/list")
	public void boardList() {
		
	}
}
