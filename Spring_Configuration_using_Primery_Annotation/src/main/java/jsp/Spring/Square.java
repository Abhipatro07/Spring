package jsp.Spring;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

	@Override
	public void print() {
		System.out.println("4 Sides");
	}
	

}
