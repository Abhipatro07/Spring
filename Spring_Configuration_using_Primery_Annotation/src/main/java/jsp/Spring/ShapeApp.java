package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {
	
	@Autowired
	Shape shape;
	
	public void display() {
		shape.print();
	}
}