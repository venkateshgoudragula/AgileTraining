package com.agilecrm.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.agilecrm.dao.Ticketsdao;

import com.agilecrm.model.Ticketdto;
import com.agilecrm.utils.TicketUtils;




public class TicketdaoImpl implements Ticketsdao {
	int status=0;
	Connection con=null;
	PreparedStatement ps=null;
	@Override
	public int CreateTicketDao(Ticketdto t) {
		// TODO Auto-generated method stub
		
		
		try {
			con=TicketUtils.jdbcConnection();
			ps=con.prepareStatement(
					"insert into Ticket(name,email,problem_type,problem_desc,group_name,Assignee,status) values (?,?,?,?,?,?,?)");
			    ps.setString(1,t.getName());
			    ps.setString(2,t.getEmail());
			    ps.setString(3,t.getProblem_type());
			    ps.setString(4,t.getProblem_desc());
			    ps.setString(5,t.getGroup_name());
			    ps.setString(6,t.getAssignee());
			    ps.setString(7,t.getStatus());
			    status= ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	       return status;

		}
	

	@Override
	public void updateContact(Ticketdto c, String email) {
	
		    try{  
	            con=TicketUtils.jdbcConnection();  
	            ps=con.prepareStatement(  
	                         "update Ticket set name=?,email=?,problem_type=?,problem_desc=?,group_name=?,Assignee=?,status=? where email=?");  
	            ps.setString(1,c.getName());  
	            ps.setString(2,c.getEmail());  
	            ps.setString(3,c.getProblem_type());
	            ps.setString(4,c.getProblem_desc());
	            ps.setString(5, c.getGroup_name());
	            ps.setString(6,c.getAssignee());
	            ps.setString(7, c.getStatus());
	          
	            ps.setString(8, email);
	            int n=ps.executeUpdate();  
	            if(n==0) {
	            	System.out.println("Failed");
	            } 
	            else {
	            	System.out.println("updated");
	            }
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	       
	 }  
		
	

	@Override
	public void deleteTicket(String m) {
		// TODO Auto-generated method stub
		 try{  
	            con=TicketUtils.jdbcConnection();  
	            ps=con.prepareStatement("delete from Ticket where email=?");  
	            ps.setString(1,m);  
	            ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}
		 
	          
	       
	    }


	@Override
	public List<Ticketdto> getAllticket() {
		// TODO Auto-generated method stub
		 List<Ticketdto> li=new ArrayList<>();
		try {
		 con=TicketUtils.jdbcConnection();  
         ps=con.prepareStatement("select * from Ticket");  
         ResultSet rs=ps.executeQuery();  
         while(rs.next()){  
        	 Ticketdto tickets=new Ticketdto();
        	 
        	 tickets.setId(rs.getInt(1));  
        	 tickets.setName(rs.getString(2));
        	 tickets.setEmail(rs.getString(3));
        	 tickets.setProblem_type(rs.getString(4));
        	 tickets.setProblem_type(rs.getString(5));
        	 tickets.setGroup_name(rs.getString(6));
        	 tickets.setAssignee(rs.getString(7));
        	 tickets.setStatus(rs.getString(8));
        	 
        	li.add(tickets);
         }
	            con.close();  
	        }catch(Exception e){e.printStackTrace();
	        }
		return li;
		}


	@Override
	public Ticketdto getTicketById(int id) {
		// TODO Auto-generated method stub
		Ticketdto tickets=new Ticketdto();
		try {
			con=TicketUtils.jdbcConnection();  
         ps= con.prepareStatement("select * from Ticket where id=?");
          
          ps.setInt(1,id);  
          ResultSet rs=ps.executeQuery();  
          if(rs.next()){  
        	  tickets.setId(rs.getInt(1));
        	  tickets.setName(rs.getString(2));  
        	  tickets.setEmail(rs.getString(3));  
        	  tickets.setProblem_type(rs.getString(4));  
        	  tickets.setProblem_desc(rs.getString(5)); 
        	  tickets.setGroup_name(rs.getString(6));
        	  tickets.setAssignee(rs.getString(7));
        	  tickets.setStatus(rs.getString(8));
           con.close();  
      }    con.close();  
    }catch(Exception e){e.printStackTrace();
    }
       return tickets;
}
	


	@Override
	public Ticketdto getTicketByEmail(String email) {
		// TODO Auto-generated method stub
		Ticketdto tickets=new Ticketdto();
		try {
			con=TicketUtils.jdbcConnection();  
         ps= con.prepareStatement("select * from Ticket where email=?");
          
          ps.setString(1,email);  
          ResultSet rs=ps.executeQuery();  
          if(rs.next()){  
        	  tickets.setId(rs.getInt(1));
        	  tickets.setName(rs.getString(2));  
        	  tickets.setEmail(rs.getString(3));  
        	  tickets.setProblem_type(rs.getString(4));  
        	  tickets.setProblem_desc(rs.getString(5)); 
        	  tickets.setGroup_name(rs.getString(6));
        	  tickets.setAssignee(rs.getString(7));
        	  tickets.setStatus(rs.getString(8));
           con.close();  
      }    con.close();  
    }catch(Exception e){e.printStackTrace();
    }
       return tickets; 
       
	}
	}
	



