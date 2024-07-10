package com.himedia.board.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.himedia.board.project.dto.MemberDTO;
import com.himedia.board.project.services.MemberService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	private HttpSession session;
	
	@GetMapping("/member")
	public @ResponseBody ResponseEntity<String> getMember(@RequestBody MemberDTO member) {
		MemberDTO dto = new MemberDTO();
		
		try {
			
			dto = memberService.getMember(member.getUserid());
			
			return ResponseEntity.ok("사용 가능한 아이디입니다.");
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PostMapping("/join")
	public @ResponseBody ResponseEntity<String> join(@RequestBody MemberDTO member) {
		try {
			memberService.join(member);
			
			return ResponseEntity.ok("회원가입 성공");	
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PostMapping("/login")
	public @ResponseBody ResponseEntity<String> login(@RequestBody MemberDTO member) {
		try {
			session.setAttribute("member", member);
			
			return ResponseEntity.ok(member.getName() + "님 어서오세요.");
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PostMapping("/logout")
	public @ResponseBody ResponseEntity<String> logout(@RequestBody MemberDTO member) {
		try {
			session.removeAttribute("member");
			
			return ResponseEntity.ok("로그아웃 하셨습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}
}
