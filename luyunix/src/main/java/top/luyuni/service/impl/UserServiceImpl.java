package top.luyuni.service.impl;

import top.luyuni.entity.User;
import top.luyuni.service.UserServeice;

public class UserServiceImpl implements UserServeice {


	@Override
	public User getUserById(Integer id) {
		User user = new User();
		user.setAge(11);
		user.setUsername("niyulu");
		return user;
	}
}
