package msoa.register.atom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}