package spring.lang;

import org.springframework.stereotype.Component;

@Component("en")
public class English implements Language {
	public String getGreeting() {
		return "Hello";
	}

	public String getBye() {
		return "Goodbye";
	}
}
