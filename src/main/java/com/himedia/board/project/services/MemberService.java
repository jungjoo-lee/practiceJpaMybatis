package com.himedia.board.project.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.himedia.board.project.dao.MemberDAO;
import com.himedia.board.project.dto.MemberDTO;

@Service
@Transactional
public class MemberService {
	private final MemberDAO memberDAO;
	
	public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

	public void join(MemberDTO member) {
		memberDAO.join(member);
	}

	public MemberDTO getMember(String userid) {
		return memberDAO.getMember(userid);
	}
}
