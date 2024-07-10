package com.himedia.board.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Entity
@Table(name = "member")
@Getter
@ToString(exclude = "pwd")
@Builder
@AllArgsConstructor
public class Member {
	@Id
	@Column(name = "userid")
	private String userid;
	
	@Column(name = "pwd", unique = true)
	private String pwd;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "address")
	private String address;
	
	public Member() {}
}
