package jbr.springmvc.service;

import java.util.List;

import jbr.springmvc.model.User;

public interface UserService {

  void register(User user);
  
  List getUser();
 }
