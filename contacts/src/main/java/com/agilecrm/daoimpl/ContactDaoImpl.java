package com.agilecrm.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.agilecrm.dao.ContactDao;

import com.agilecrm.model.Contactdto;
import com.agilecrm.utils.contactutils;


public class ContactDaoImpl implements ContactDao{

	
public int addContact(Contactdto c) {
		int status=0;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=contactutils.jdbcConnection();
			ps=con.prepareStatement(
					"insert into contact(first_name,last_name,mail,createdBy,createdDate,address,dob,isActive,updatedBy,updatedDate) values (?,?,?,?,?,?,?,?,?,?)");
			    ps.setString(1,c.getFirst_name());  
	            ps.setString(2,c.getLast_name());  
	            ps.setString(3,c.getMail());  
	            ps.setString(4,c.getCreatedBy());
	            ps.setString(5, c.getCreatedDate());
	            ps.setString(6,c.getAddress());
	            ps.setString(7, c.getDob());
	            ps.setBoolean(8, c.isActive());
	            ps.setString(9, c.getUpdatedBy());
	           ps.setString(10, c.getUpdatedDate());
	           
	          status= ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	       return status;

		}
		
	@Override
	public int deleteContact(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		
		  try{  
	            con=contactutils.jdbcConnection();  
	            ps=(PreparedStatement) con.prepareStatement("delete from contact where id=?");  
	            ps.setInt(1,id);  
	            ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}
		return id;  
	          
	       
	    }  
	
   @Override
	public void updateContact(Contactdto c, String mail) {

		Connection con=null;
		PreparedStatement ps=null;
	    try{  
            con=contactutils.jdbcConnection();  
            ps=con.prepareStatement(  
                         "update contact set first_name=?,last_name=?,mail=?,createdBy=?,createdDate=?,address=?,dob=?,isActive=?,updatedBy=?,updatedDate=? where mail=?");  
            ps.setString(1,c.getFirst_name());  
            ps.setString(2,c.getLast_name());  
            ps.setString(3,c.getMail());
            ps.setString(4,c.getCreatedBy());
            ps.setString(5, c.getCreatedDate());
            ps.setString(6,c.getAddress());
            ps.setString(7, c.getDob());
            ps.setBoolean(8, c.isActive());
            ps.setString(9, c.getUpdatedBy());
            ps.setString(10, c.getUpdatedDate());
            ps.setString(11, mail);
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
	public Contactdto retriveContact(int id) {
		Connection con=null;
		PreparedStatement ps=null;
		Contactdto e=new Contactdto();  
		try{  
			
            con=contactutils.jdbcConnection();  
            ps=(PreparedStatement) con.prepareStatement("select * from contact");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
               
              e.setId(rs.getInt(1));  
                e.setFirst_name(rs.getString(2));  
                e.setLast_name(rs.getString(3));  
                e.setMail(rs.getString(4));  
                e.setAddress(rs.getString(5));
                e.setDob(rs.getString(6));
                e.setCreatedBy(rs.getString(8));
                e.setUpdatedBy(rs.getString(9));
                e.setCreatedDate(rs.getString(10));
                e.setUpdatedDate(rs.getString(11));
                e.setActive(true);
                con.close();
            }  
           // con.close();  
        }
		catch(Exception s){
        	s.printStackTrace();
        	}
		return e;  
          
    }

	public Contactdto getContactById(int id) {
		// TODO Auto-generated method stub
		 Contactdto e=new Contactdto(); 
		 
		Connection con=null;
		
		java.sql.PreparedStatement ps=null;
		
	        try{  
	            con=contactutils.jdbcConnection();  
	           ps= con.prepareStatement("select * from contact where id=?");
	            //ps=(PreparedStatement) con.prepareStatement("select * from contact where id=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                  e.setId(rs.getInt(1));
	                e.setFirst_name(rs.getString(2));  
	                e.setLast_name(rs.getString(3));  
	                e.setMail(rs.getString(4));  
	                e.setAddress(rs.getString(5)); 
	                 e.setDob(rs.getString(6));
	                e.setCreatedBy(rs.getString(7));
	                e.setUpdatedBy(rs.getString(8));
	                e.setCreatedDate(rs.getString(9));
	                e.setUpdatedDate(rs.getString(10));
	                e.setActive(true);
	              
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}
			return e;  
	          
	        
	    }  
	public Contactdto getContactByFirstName(String first_name) {
		// TODO Auto-generated method stub
		 Contactdto e=new Contactdto(); 
		 
		Connection con=null;
		
		java.sql.PreparedStatement ps=null;
		
	        try{  
	            con=contactutils.jdbcConnection();  
	           ps= con.prepareStatement("select * from contact where first_name=?");
	            //ps=(PreparedStatement) con.prepareStatement("select * from contact where id=?");  
	           ps.setString(1,first_name);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                 e.setId(rs.getInt(1));
	                e.setFirst_name(rs.getString(2));  
	                e.setLast_name(rs.getString(3));  
	                e.setMail(rs.getString(4));  
	                e.setAddress(rs.getString(5)); 
	                e.setDob(rs.getString(6));
	                e.setCreatedBy(rs.getString(7));
	                e.setUpdatedBy(rs.getString(8));
	                e.setCreatedDate(rs.getString(9));
	                e.setUpdatedDate(rs.getString(10));
	                e.setActive(true);
	              
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}
			return e;  
	}
	}  
		
	

	

