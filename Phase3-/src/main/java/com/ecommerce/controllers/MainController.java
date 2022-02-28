package com.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MainController {
@Autowired
private ProductRepository repository;
@RequestMapping("/")
@ResponseBody
public String index() {
	return "This is running under SSL";
}
}
