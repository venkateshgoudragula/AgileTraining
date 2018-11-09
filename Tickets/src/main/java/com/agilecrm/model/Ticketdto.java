package com.agilecrm.model;

public class Ticketdto {
    private int id;
	private String name;
	private String email;
	private String problem_type;
	private String problem_desc;
	private String group_name;
	private String Assignee;
	private String status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProblem_type() {
		return problem_type;
	}
	public void setProblem_type(String problem_type) {
		this.problem_type = problem_type;
	}
	public String getProblem_desc() {
		return problem_desc;
	}
	public void setProblem_desc(String problem_desc) {
		this.problem_desc = problem_desc;
	}
	
	public String getAssignee() {
		return Assignee;
	}
	public void setAssignee(String assignee) {
		Assignee = assignee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ticketdto [id=" + id + ", name=" + name + ", email=" + email + ", problem_type=" + problem_type
				+ ", problem_desc=" + problem_desc + ", group_name=" + group_name + ", Assignee=" + Assignee
				+ ", status=" + status + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getProblem_type()=" + getProblem_type() + ", getProblem_desc()=" + getProblem_desc()
				+ ", getAssignee()=" + getAssignee() + ", getStatus()=" + getStatus() + ", getGroup_name()="
				+ getGroup_name() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
