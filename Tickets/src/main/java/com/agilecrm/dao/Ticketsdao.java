package com.agilecrm.dao;
import java.util.List;

import com.agilecrm.model.Ticketdto;

public interface Ticketsdao {
	public int CreateTicketDao(Ticketdto t);
	public void updateContact(Ticketdto c,String email);
	public void deleteTicket(String mail);
	public List<Ticketdto> getAllticket();
	public Ticketdto getTicketById(int id);
	public Ticketdto getTicketByEmail(String email);
}
