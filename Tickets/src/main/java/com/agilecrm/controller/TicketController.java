package com.agilecrm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agilecrm.model.Ticketdto;
import com.agilecrm.serviceimpl.TicketServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class TicketController
 */
public class TicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * Default constructor. 
     */
    public TicketController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        TicketServiceImpl ts=new TicketServiceImpl();
        String action=request.getParameter("action");
        Ticketdto t=null;
	    if(action.equals("all")) {  
        List<Ticketdto> g=ts.getAllticketService();
        ObjectMapper mapper = new ObjectMapper();
        String newsLetterJSON = mapper.writeValueAsString(g);
	     out.println(newsLetterJSON);
         
       
	}
	    else if(action.equals("id")) {
	    	
	    	int s= Integer.parseInt((request.getParameter("id")));
		    t=ts.getTicketByIdService(s);
		     ObjectMapper mapper = new ObjectMapper();
            String newsLetterJSON = mapper.writeValueAsString(t);
		     out.println(newsLetterJSON);
	}
	    else if(action.equals("email")) {
	    	 String f= request.getParameter("email");
		     t =ts.getTicketByEmail(f);
		     ObjectMapper mapper1 = new ObjectMapper();
             String newsLetterJSON1 = mapper1.writeValueAsString(t);
		     out.println(newsLetterJSON1);  
	    }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hi ");
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String problem_type=request.getParameter("problem_type");
        String problem_desc=request.getParameter("problem_desc");
        String group_name=request.getParameter("group_name");
        String Assignee=request.getParameter("Assignee");
        String status=request.getParameter("status");
		Ticketdto t=new Ticketdto();
		t.setName(name);
		t.setEmail(email);
		t.setProblem_type(problem_type);
		t.setProblem_desc(problem_desc);
		t.setGroup_name(group_name);
		t.setAssignee(Assignee);
		t.setStatus(status);
		
		TicketServiceImpl ts=new TicketServiceImpl();
	      
	        ts.CreateTicksetService(t);
	         
	          
	        out.close();  
		// TODO Auto-generated method stub
		doGet(request, response);
	}

      protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
    	TicketServiceImpl ts=new TicketServiceImpl();
    	 String email=request.getParameter("email");
		ts.deleteTicketService(email);
    	out.close();  
      }
      protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  response.setContentType("text/html");  
          PrintWriter out=response.getWriter(); 
          String name=request.getParameter("name");
          String email=request.getParameter("email");
          String problem_type=request.getParameter("problem_type");
          String problem_desc=request.getParameter("problem_desc");
          String group_name=request.getParameter("group_name");
          String Assignee=request.getParameter("Assignee");
          String status=request.getParameter("status");
    	  Ticketdto t=new Ticketdto();
  		t.setName(name);
  		t.setEmail(email);
  		t.setProblem_type(problem_type);
  		t.setProblem_desc(problem_desc);
  		t.setGroup_name(group_name);
  		t.setAssignee(Assignee);
  		t.setStatus(status);
  		
  		TicketServiceImpl ts=new TicketServiceImpl();
  	      
  	        ts.updateContactService(t, request.getParameter("emailId"));
  	         
  	          
  	        out.close();  
  		// TODO Auto-generated method stub
  		doGet(request, response);
      
      }
   }

