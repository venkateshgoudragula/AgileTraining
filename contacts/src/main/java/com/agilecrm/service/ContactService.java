package com.agilecrm.service;

import java.util.ArrayList;

import com.agilecrm.model.Contactdto;

public interface ContactService {
	public int addContactservice(Contactdto contact);
	public void updateContactservice(Contactdto contact,String mail);
	public int deleteContactservice(int id);
	//public Contactdto getContactById(String id);
	 public ArrayList<Contactdto> getAllEmployees();
	Contactdto getContactById(int i);
	Contactdto getContactByFirstName(String first_name);
	
}
