package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import spring.lang.Language;

@Service
public class GreetingService {
	@Autowired
	@Qualifier("en")
	private Language language;

	public GreetingService() {

	}

	public void sayGreeting() {
		System.out.println(language.getGreeting());
	}
}
