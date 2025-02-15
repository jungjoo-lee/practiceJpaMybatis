package com.himedia.board.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MemberDTO {
	private String userid;
	private String pwd;
	private String name;
	private String email;
	private String address;
	
	public MemberDTO() {}
}
