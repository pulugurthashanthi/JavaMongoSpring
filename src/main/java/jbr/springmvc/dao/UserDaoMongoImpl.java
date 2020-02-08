package jbr.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import jbr.springmvc.model.User;

public class UserDaoMongoImpl implements UserDao {

	   private final MongoTemplate mongoTemplate;
	   List users =new ArrayList();
	private static final String User_COLLECTION = "User";
    @Autowired
	public UserDaoMongoImpl(MongoTemplate mongoTemplate){
	
		this.mongoTemplate=mongoTemplate;
		
	}
  public void register(User user) {
	  users.add(user);
	  mongoTemplate.insert(users,User.class);
  }
public List getUser()
{
	users.clear();
	users=mongoTemplate.findAll(User.class);
	System.out.println(users.size());
	return users;
}
}


