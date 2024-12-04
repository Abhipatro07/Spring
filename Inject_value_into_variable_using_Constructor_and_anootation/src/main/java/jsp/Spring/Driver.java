package jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("MyConfig.xml");
		Student s = ac.getBean("student" , Student.class);
		System.out.println(s.id);
		System.out.println(s.name);
	}

}
