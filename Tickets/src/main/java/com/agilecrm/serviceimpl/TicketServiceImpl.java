package com.agilecrm.serviceimpl;

import com.agilecrm.daoimpl.TicketdaoImpl;
import com.agilecrm.model.Ticketdto;
import com.agilecrm.service.TicketService;

public class TicketServiceImpl implements TicketService {
	TicketdaoImpl td=new TicketdaoImpl();
	@Override
	public int CreateTicksetService(Ticketdto t) {
		// TODO Auto-generated method stub
		
		return td.CreateTicketDao(t);
	}

	@Override
	public void updateContactService(Ticketdto c, String mail) {
		// TODO Auto-generated method stub
		td.updateContact(c, mail);
		
	}

	@Override
	public void deleteTicketService(String email) {
		// TODO Auto-generated method stub
		td.deleteTicket(email);
	}

	@Override
	public java.util.List<Ticketdto> getAllticketService() {
		// TODO Auto-generated method stub
		return td.getAllticket();
	}

	@Override
	public Ticketdto getTicketByIdService(int id) {
		// TODO Auto-generated method stub
		return td.getTicketById(id);
	}

	@Override
	public Ticketdto getTicketByEmail(String email) {
		// TODO Auto-generated method stub
		return td.getTicketByEmail(email);
	}

	



}
