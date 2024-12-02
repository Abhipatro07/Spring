package jsp.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	int id;
	@Value("Abhi")
	String name;
	@Value("500000")
	double salary;
}
