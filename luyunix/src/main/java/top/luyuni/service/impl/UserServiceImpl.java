package top.luyuni.service.impl;

import top.luyuni.entity.User;
import top.luyuni.service.UserServeice;

public class UserServiceImpl implements UserServeice {

	@Override
	public String sayHello(String name) {
		return "im " + name;
	}
}
