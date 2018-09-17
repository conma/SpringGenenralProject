package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.MainApp;

@Configuration
@ComponentScan({"spring.lang", "spring.service"})
public class AppConfiguration {
	@Bean(name="mainApp")
	MainApp mainApp() {
		return new MainApp();
	}

}
