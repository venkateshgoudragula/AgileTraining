package com.agilecrm.dao;



import com.agilecrm.model.Contactdto;

public interface ContactDao {
	public static int addContact(Contactdto c) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int deleteContact(int id);
	public void updateContact(Contactdto c,String mail);
	public Contactdto retriveContact(int id);
	public Contactdto getContactById(int i);
	public Contactdto getContactByFirstName(String first_name);
}
