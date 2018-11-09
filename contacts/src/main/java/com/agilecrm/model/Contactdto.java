package com.agilecrm.model;

public class Contactdto extends Base {
	
	int id;
	String first_name;
	String last_name;
	String mail;
    String address;
	String dob;
	boolean isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Contactdto [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", mail=" + mail
				+ ", address=" + address + ", dob=" + dob + ", isActive=" + isActive + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", getId()=" + getId() + ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name()
				+ ", getMail()=" + getMail() + ", getAddress()=" + getAddress() + ", getDob()=" + getDob()
				+ ", isActive()=" + isActive() + ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()="
				+ getCreatedDate() + ", getUpdatedBy()=" + getUpdatedBy() + ", getUpdatedDate()=" + getUpdatedDate()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
	
	
	
