package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passanger {
	private Ticket ticket;

	@Autowired
	public Passanger(Ticket ticket) {
		super();
		this.ticket = ticket;
	}
	
	public void detail() {
		System.out.println("Detail of the ticket");
		ticket.show();
	}
	
	
}




















