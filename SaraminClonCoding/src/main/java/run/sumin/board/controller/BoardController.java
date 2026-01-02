package run.sumin.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import run.sumin.board.service.BoardService;
import run.sumin.dto.BoardDTO;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/index")
	public String formIndex(Model model){
		List<BoardDTO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		return "index";
	}
	@GetMapping("/board/view.do")
	public String formView(){
		return "board/boardview";
	}
	@GetMapping("/board/insert.do")
	public String formInsert(){
		return "board/boardinsert";
	}
	
	
}
