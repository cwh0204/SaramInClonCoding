package run.sumin.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/index")
	public String formIndex(){
		return "index";
	}
	@GetMapping("/board/view")
	public String formView(){
		return "board/boardview";
	}
	@GetMapping("/board/insert")
	public String formInsert(){
		return "board/boardinsert";
	}
}
