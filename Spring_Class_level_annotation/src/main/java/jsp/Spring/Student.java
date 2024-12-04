package jsp.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	@Value("21")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Abhi")
	public void setName(String name) {
		this.name = name;
	}
	
	
}
