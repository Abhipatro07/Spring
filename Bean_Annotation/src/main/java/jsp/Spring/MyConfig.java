package jsp.Spring;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "jsp.Spring")
public class MyConfig {
	
	@Bean(value="scanner")
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean(value="student")
	public Student getStudent() {
		return new Student();
	}
}
