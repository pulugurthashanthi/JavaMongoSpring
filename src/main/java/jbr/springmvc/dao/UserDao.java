package jbr.springmvc.dao;

import java.util.List;

import jbr.springmvc.model.User;

public interface UserDao {

  void register(User user);
  List getUser();
}
