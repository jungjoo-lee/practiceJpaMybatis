package com.himedia.board.project.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himedia.board.project.dto.MemberDTO;
import com.himedia.board.project.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
	
}
