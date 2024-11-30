package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory fac = new ClassPathXmlApplicationContext("MyConfig.xml");
		Shop s = fac.getBean("myshop" , Shop.class);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getLocation());
		System.out.println(s.getItems());
	}

}
