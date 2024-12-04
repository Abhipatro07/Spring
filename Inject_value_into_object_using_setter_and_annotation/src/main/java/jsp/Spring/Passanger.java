package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passanger {
	private Ticket ticket;

	public Ticket getTicket() {
		return ticket;
	}

	@Autowired
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void detail() {
		System.out.println("Detail of ticket");
		ticket.show();
	}
	
	
}

















