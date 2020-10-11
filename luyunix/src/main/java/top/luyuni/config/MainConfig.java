package top.luyuni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.luyuni.service.CarService;
import top.luyuni.service.impl.CarServiceImpl;

@Configuration
@ComponentScan("top.luyuni")
public class MainConfig {
	@Bean
	public CarService carService() {
		return new CarServiceImpl();
	}
}
