package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.config.AppConfiguration;
import spring.service.GreetingService;

public class MainApp {
	@Autowired
	private GreetingService greetingService;
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MainApp mainApp = (MainApp) context.getBean("mainApp");
		mainApp.run();
	}

	private void run() {
		greetingService.sayGreeting();
	}
}
