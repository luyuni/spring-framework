package top.luyuni;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.luyuni.entity.User;
import top.luyuni.service.UserServeice;

public class XmlMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		UserServeice userService = (UserServeice) context.getBean("userService");
		String hello = userService.sayHello("niyulu");
		System.out.println(hello);
	}
}
