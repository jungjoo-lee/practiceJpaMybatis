package com.himedia.board.project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.himedia.board.project.dto.MemberDTO;

@Mapper
public interface MemberDAO {
	void join(MemberDTO member);
	MemberDTO getMember(@Param("userid") String userid);
}
