package jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		ShapeApp s = ac.getBean("shapeApp" , ShapeApp.class);
		s.display();
	}
}
