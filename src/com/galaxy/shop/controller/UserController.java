package com.galaxy.shop.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxy.shop.model.entity.User;
import com.galaxy.shop.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;

	@RequestMapping("list")
	public void list(HttpServletRequest request,Model model){
		
		List<User> list = this.userService.getAll();
		model.addAttribute("list", list);
		
	}
	
	
	
}
