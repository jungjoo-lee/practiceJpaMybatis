package com.himedia.board.project.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.himedia.board.project.dao.BoardDAO;
import com.himedia.board.project.dto.BoardDTO;

@Service
@Transactional
public class BoardService {
	private final BoardDAO boardDAO;
	
	public BoardService(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }
	
	public List<BoardDTO> getBoardList() {
		return boardDAO.getBoardList();
	}

	public void insertBaord(BoardDTO dto) {
		boardDAO.insertBoard(dto);
	}

	public void updateBoard(BoardDTO dto) {
		boardDAO.updateBoard(dto);
	}

	public void deleteBoard(int bseq) {
		boardDAO.deleteBoard(bseq);
	}

	public BoardDTO getBoard(int bseq) {
		return boardDAO.getBoard(bseq);
	}
}
