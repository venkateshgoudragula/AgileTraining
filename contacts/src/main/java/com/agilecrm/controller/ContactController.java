package com.agilecrm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agilecrm.model.Contactdto;
import com.agilecrm.service.ContactService;
import com.agilecrm.serviceimpl.ContactServiceimpl;
import com.agilecrm.utils.DateUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class contactcontroller
 */
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactService cd=new ContactServiceimpl();
    int status=0;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	Contactdto li=null;
		PrintWriter out=response.getWriter();
	/*int s= Integer.parseInt((request.getParameter("id")));
		     li =cd.getContactById(s);
		     ObjectMapper mapper = new ObjectMapper();
             String newsLetterJSON = mapper.writeValueAsString(li);
		     out.println(newsLetterJSON);*/
		  
		   String f= request.getParameter("first_name");
		     li =cd.getContactByFirstName(f);
		     ObjectMapper mapper1 = new ObjectMapper();
             String newsLetterJSON1 = mapper1.writeValueAsString(li);
		     out.println(newsLetterJSON1);  
		     
	}
	
	
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
	/*	response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       String first_name=request.getParameter("first_name");  
        String last_name=request.getParameter("last_name");  
        String mail=request.getParameter("mail");  
        String address=request.getParameter("address");  
        String createdBy=request.getParameter("createdBy");  
        String createdDate=request.getParameter("createdDate");  
        String updatedBy=request.getParameter("updatedBy");  
        String updatedDate=request.getParameter("updatedDate");   
       // Boolean isActive=request.getParameter("isActive")
        
        		
       	Contactdto e=new Contactdto();  
        e.setFirst_name(first_name);
        e.setLast_name(last_name);
        e.setMail(mail);  
        e.setAddress(address);  
       try {
		e.setDob(DateUtil.toDate(request.getParameter("dob")));
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
        e.setCreatedBy(createdBy);
       try {
		e.setCreatedDate(DateUtil.toDate(request.getParameter("createdDate")));
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
        e.setUpdatedBy(updatedBy);
       try {
		e.setUpdatedDate(DateUtil.toDate(request.getParameter("updatedDate")));
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
        
        ContactServiceimpl cd=new ContactServiceimpl();
        int status=0;
        status = cd.addContactservice(e);
         if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            
        }else{  
            out.println("record not inserted");  
        }  
          
        out.close();  
	
		doGet(request, response);
		
	}*/
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		int status;
		int s= Integer.parseInt((request.getParameter("id")));
        status = cd.deleteContactservice(s);
        
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
         String email=request.getParameter("email");
		Contactdto c = new Contactdto();
		c.setFirst_name(request.getParameter("first_name"));
		c.setLast_name(request.getParameter("last_name"));
		c.setMail(request.getParameter("mail"));
		c.setCreatedBy(request.getParameter("createdBy"));
		try {
			c.setCreatedDate(DateUtil.toDate(request.getParameter("createdDate")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setAddress(request.getParameter("address"));
		try {
			c.setDob(DateUtil.toDate(request.getParameter("dob")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setActive(true);
		c.setUpdatedBy(request.getParameter("updatedBy"));
		try {
			c.setUpdatedDate((DateUtil.toDate(request.getParameter("updatedDate"))));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.updateContactservice(c, email);
	}

	
	

}


