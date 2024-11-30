package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory fac = new ClassPathXmlApplicationContext("MyConfig.xml");
		Person p = fac.getBean("myperson" , Person.class);
		
		p.message();
	}

}
