package com.framgia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.framgia.model.Product;
import com.framgia.service.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product")
	public String findAllProduct(Model model){
		List<Product> list = productService.findAllProduct();
		model.addAttribute("listProduct", list);
		return "product";
	}

}
