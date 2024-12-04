package jsp.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	@Value("21")
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Value("Abhi")
	public void setName(String name) {
		this.name = name;
	}
	
	
}
