package top.luyuni;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.luyuni.entity.User;
import top.luyuni.service.UserServeice;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		UserServeice userService = (UserServeice) context.getBean("userService");
		User user = userService.getUserById(11);
		System.out.println(user);
	}
}
