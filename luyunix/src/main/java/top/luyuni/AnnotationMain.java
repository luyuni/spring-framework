package top.luyuni;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.luyuni.config.MainConfig;
import top.luyuni.service.CarService;

public class AnnotationMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		CarService carService = applicationContext.getBean(CarService.class);
		String hello = carService.sayHello("red");
		System.out.println(hello);
	}
}
