package com.libra.demo.service;

import java.util.List;

import com.libra.demo.pojo.User;

public interface UserService {

	public void saveUser(User user) throws Exception;

	public void updateUser(User user);

	public void deleteUser(Integer userId);

	public User queryUserById(Integer userId);

	public List<User> queryUserList(User user);
	
}
