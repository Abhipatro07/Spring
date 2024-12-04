package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passanger {
	@Autowired
	Ticket ticket;
	
	public void detail() {
		System.out.println("Here is the ticket");
		ticket.travel();
	}
}
