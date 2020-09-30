package com.liup.cc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.liup.cc.domain.User;
import com.liup.cc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> list(){
		Map<String, Object> modelMap = new HashMap<>();
		User user = new User();
		PageInfo<User> list = userService.getPageList(user, 1, 2);
		modelMap.put("userList", list.getList());
		return modelMap;
	}
}
