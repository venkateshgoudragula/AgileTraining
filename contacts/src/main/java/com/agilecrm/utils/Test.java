package com.agilecrm.utils;

import com.agilecrm.dao.ContactDao;
import com.agilecrm.daoimpl.ContactDaoImpl;
import com.agilecrm.model.Contactdto;

public class Test {
public static void main(String[] args) {
	ContactDao dao=new ContactDaoImpl();
	Contactdto d	=dao.getContactById(2);
	System.out.println(d);
}
}
