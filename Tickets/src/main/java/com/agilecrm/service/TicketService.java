package com.agilecrm.service;

import java.util.List;

import com.agilecrm.model.Ticketdto;

public interface TicketService {
	public int CreateTicksetService(Ticketdto t);
	public void updateContactService(Ticketdto c,String mail);
	public void deleteTicketService(String mail);
	public List<Ticketdto> getAllticketService();
	public Ticketdto getTicketByIdService(int id);
	public Ticketdto getTicketByEmail(String email);
}
