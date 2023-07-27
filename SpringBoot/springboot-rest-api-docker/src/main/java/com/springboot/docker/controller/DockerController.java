package com.springboot.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@RequestMapping("/docker")
public String docker() {
	return "learning Docker";
}
}
