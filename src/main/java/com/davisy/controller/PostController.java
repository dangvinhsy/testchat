package com.davisy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davisy.config.JwtTokenUtil;
import com.davisy.service.impl.PostServiceImpl;
import com.davisy.service.impl.UserServiceImpl;

@RestController
@CrossOrigin("*")
public class PostController {
	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Autowired
	PostServiceImpl postServiceImpl;

	@GetMapping("/v1/user/getTop5Post")
	public ResponseEntity<List<Object[]>> getTOP5Post() {
		List<Object[]> list = postServiceImpl.getTOP5Post();
		return ResponseEntity.ok(list);
	}
}