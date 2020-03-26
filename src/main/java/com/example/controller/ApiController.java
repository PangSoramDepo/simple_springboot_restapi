package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping("/data")
	public String Data()
	{
		return "Data API By PoPo_Master";
	}
}
