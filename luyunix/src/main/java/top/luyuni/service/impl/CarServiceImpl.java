package top.luyuni.service.impl;

import top.luyuni.service.CarService;

public class CarServiceImpl implements CarService {
	@Override
	public String sayHello(String name) {
		return "im " + name + " car";
	}
}
