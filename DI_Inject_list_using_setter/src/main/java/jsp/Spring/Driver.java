package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory fac = new ClassPathXmlApplicationContext("MyCOonfig.xml");
		Student s = fac.getBean("mystudent" , Student.class);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getSub());
	}

}
