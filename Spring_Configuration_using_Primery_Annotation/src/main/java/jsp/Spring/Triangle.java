package jsp.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class Triangle implements Shape{

	@Override
	public void print() {
		System.out.println("3 Sides");
	}

}
