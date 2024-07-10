package com.himedia.board.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.himedia.board.project.dto.BoardDTO;
import com.himedia.board.project.services.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public @ResponseBody List<BoardDTO> getBoardList() {
		return boardService.getBoardList();
	}
	
	@PostMapping("/board")
	public void insertBoard(@RequestBody BoardDTO dto) {
		boardService.insertBaord(dto);
	}
	
	@PutMapping("/board")
	public void updateBoard(@RequestBody BoardDTO dto) {
		boardService.updateBoard(dto);
	}
	
	@DeleteMapping("/board/{bseq}")
	public void deleteBoard(@PathVariable int bseq) {
		boardService.deleteBoard(bseq);
	}
	
	@GetMapping("/board/view/{bseq}")
	public BoardDTO getBoard(@PathVariable int bseq) {
		BoardDTO board = new BoardDTO();
		
		try {
			board = boardService.getBoard(bseq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return board;
	}
}
