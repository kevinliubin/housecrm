package com.lb.ssm.service;

import java.util.List;

import com.lb.ssm.vo.User;

public interface UserService {
	User getUser(User user);
	List<User> getUserList(String limit,String offset);
	List<User> getSearchUserList(String name,String limit,String offset);
	int countUser();
	User getUserById(Integer id);
	void updateUser(User user);
	int deleteUser(Integer userId);
	void addUser(User user );
}
