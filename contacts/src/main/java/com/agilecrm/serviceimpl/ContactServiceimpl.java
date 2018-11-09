package com.agilecrm.serviceimpl;

import java.util.ArrayList;

import com.agilecrm.dao.ContactDao;
import com.agilecrm.daoimpl.ContactDaoImpl;
import com.agilecrm.model.Contactdto;
import com.agilecrm.service.ContactService;

public class ContactServiceimpl implements ContactService{
	ContactDao dao=new ContactDaoImpl();
	@Override
	public int addContactservice(Contactdto contact) {
		// TODO Auto-generated method stub
		ContactDaoImpl di=new ContactDaoImpl();
		
		return di.addContact(contact);
		}

	@Override
	public void updateContactservice(Contactdto contact,String mail) {
		// TODO Auto-generated method stub
		ContactDaoImpl di=new ContactDaoImpl();
		di.updateContact(contact, mail);

	}

	@Override
	public Contactdto getContactById(int i) {
		// TODO Auto-generated method stub
		ContactDao dao=new ContactDaoImpl();
		Contactdto d	=dao.getContactById(i);
		System.out.println(d);
	
		return d;
	}

	@Override
	public ArrayList<Contactdto> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contactdto getContactByFirstName(String first_name) {
		// TODO Auto-generated method stub
		ContactDao dao=new ContactDaoImpl();
		Contactdto d	=dao.getContactByFirstName(first_name);
		System.out.println(d);
	
		return d;
	}

	@Override
	public int deleteContactservice(int id) {
		// TODO Auto-generated method stub
		ContactDao dao=new ContactDaoImpl();
		int d	=dao.deleteContact(id);
		System.out.println(d);
	
		return d;
	}

}
