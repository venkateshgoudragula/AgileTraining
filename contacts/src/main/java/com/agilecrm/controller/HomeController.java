package com.agilecrm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agilecrm.model.Contactdto;
import com.agilecrm.service.ContactService;
import com.agilecrm.serviceimpl.ContactServiceimpl;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	
	ContactService cd=new ContactServiceimpl();
    int status=0;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	Contactdto li=null;
		PrintWriter out=response.getWriter();
		int s= Integer.parseInt((request.getParameter("id")));
		     li =cd.getContactById(s);
		     out.println(li);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       String first_name=request.getParameter("first_name");  
        String last_name=request.getParameter("last_name");  
        String mail=request.getParameter("mail");  
        String address=request.getParameter("address");  
    /*    Date dob = null;
        try {
        dob = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
        } catch (ParseException n) {
        // TODO Auto-generated catch block
        n.printStackTrace();
        } */
        String createdBy=request.getParameter("createdby");  
       // String createdDate=request.getParameter("createdDate");  
       String updatedBy=request.getParameter("updatedBy");  
      //  String updatedDate=request.getParameter("updatedDate");   
       // Boolean isActive=request.getParameter("isActive")
        
        		
       	Contactdto e=new Contactdto();  
        e.setFirst_name(first_name);
        e.setLast_name(last_name);
        e.setMail(mail);  
        e.setAddress(address);  
      //  e.setDob(dob);
        e.setCreatedBy(createdBy);
      //  e.setCreatedDate(createdDate);
        e.setUpdatedBy(updatedBy);
       // e.setUpdatedDate(updatedDate);
        
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
		
	}	
}
