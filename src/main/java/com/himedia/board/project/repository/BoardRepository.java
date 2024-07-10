package com.himedia.board.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himedia.board.project.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
