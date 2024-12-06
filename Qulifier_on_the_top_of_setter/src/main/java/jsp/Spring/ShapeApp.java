package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {
	
	@Autowired
	private Shape shape;
	
	public Shape getShape() {
		return shape;
	}

	@Qualifier(value = "trinagle")
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void display() {
		shape.print();
	}
}
