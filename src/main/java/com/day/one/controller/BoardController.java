package com.day.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.day.one.dao.BoardDao;
import com.day.one.vo.BoardVO;

@Controller()
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardService;
	
	//기본 boardList부터 페이징처리까지
	@GetMapping()
	public String board() {
		return "board/boardList.tiles";
	}
	
	//조건에 의한 검색 + 페이징추가
	@GetMapping("/search")
	public String search(Model model) {
		List<BoardVO> boardList = boardService.listAll();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for(BoardVO board:boardList) {
			System.out.println("board: "+board);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		model.addAttribute("boardList",boardList);
		return "board/boardList.tiles";
	}
}
