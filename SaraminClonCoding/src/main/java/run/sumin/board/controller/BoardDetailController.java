package run.sumin.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import run.sumin.board.service.BoardService;
import run.sumin.dto.BoardDTO;

@Controller
@RequiredArgsConstructor
public class BoardDetailController {
	
	private final BoardService service;
	
	@GetMapping("/board/select")
	@ResponseBody
	public BoardDTO boardSelect(Integer jobId) {
		
		return service.selectBoardDetail(jobId);
	}
}
