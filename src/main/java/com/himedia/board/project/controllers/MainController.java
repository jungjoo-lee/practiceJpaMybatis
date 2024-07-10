package com.himedia.board.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.himedia.board.project.services.MainService;

@RestController
public class MainController {
	@Autowired
	private MainService mainService;
}
