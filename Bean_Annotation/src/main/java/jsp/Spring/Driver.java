package jsp.Spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Scanner sc = ac.getBean("scanner" , Scanner.class);
		System.out.println(sc);
		Student s = ac.getBean("student" , Student.class);
		System.out.println(s);
	}

}
