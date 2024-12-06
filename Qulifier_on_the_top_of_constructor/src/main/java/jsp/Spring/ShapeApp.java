package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {
	
	@Autowired
	Shape shape;
	
	
	public ShapeApp(@Qualifier(value = "trinagle") Shape shape) {
		super();
		this.shape = shape;
	}


	public void display() {
		shape.print();
	}
}
