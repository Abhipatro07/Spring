package jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Student s = ac.getBean("student" , Student.class);
		System.out.println(s.getId());
		System.out.println(s.getName());
	}

}
