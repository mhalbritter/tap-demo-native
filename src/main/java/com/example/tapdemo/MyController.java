package com.example.tapdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequestMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
public class MyController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/")
	String index() {
		logger.info("index()");
		return "Hello, native TAP";
	}
}
