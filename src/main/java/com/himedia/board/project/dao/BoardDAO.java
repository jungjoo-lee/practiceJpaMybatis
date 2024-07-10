package com.himedia.board.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.himedia.board.project.dto.BoardDTO;

@Mapper
public interface BoardDAO {
	List<BoardDTO> getBoardList();
	void insertBoard(BoardDTO dto);
	void updateBoard(BoardDTO dto);
	void deleteBoard(@Param("bseq") int bseq);
	BoardDTO getBoard(@Param("bseq") int bseq);
}
