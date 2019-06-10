package model;
import java.util.*; 

public class Cubicle{
	
	//Attribute
	private int extension;
	
	//Relation
	
	private Employee employee;
	
	public Cubicle(int extension){
		this.extension=extension;
		
	}
	
	public Employee getEmployee(){
		return employee;
	}
	
	public void setEmployee(Employee employee){
		this.employee=employee;
	}
	
		public int getExtension(){
		return extension;
	}
	
	public void setExtension(int extension){
		this.extension=extension;
	}
		
	
		
	

	
}

