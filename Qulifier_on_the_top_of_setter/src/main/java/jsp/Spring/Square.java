package jsp.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class Square implements Shape {

	@Override
	public void print() {
		System.out.println("4 Sides");
	}
	

}
