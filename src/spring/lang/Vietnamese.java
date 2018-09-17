package spring.lang;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("vn")
@Primary
public class Vietnamese implements Language {

	public String getGreeting() {
		return "Xin chao";
	}

	public String getBye() {
		return "Tam biet";
	}

}
