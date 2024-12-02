package jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("MyConfig.xml");
		Employee e = ac.getBean("employee" , Employee.class);
		e.work();
	}

}
