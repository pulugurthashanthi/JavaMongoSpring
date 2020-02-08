package jbr.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {
  @Autowired
  public UserService userService;
  public User user;
  @RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List getUser()
	{
		return userService.getUser();
	}
  
}
