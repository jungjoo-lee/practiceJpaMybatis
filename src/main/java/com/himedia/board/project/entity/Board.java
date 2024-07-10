package com.himedia.board.project.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "board")
@Getter
@Builder
@AllArgsConstructor
public class Board {
	@Id
	@Column(name = "bseq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bseq;
	private String title;
	private String content;
	private String writer;
	private Timestamp writeDate;
	
	public Board() {}
}
