package jsp.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	
	Student(@Value("21") int id , @Value("Abhi") String name){
		this.id = id;
		this.name = name;
	}
}
