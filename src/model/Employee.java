package model;
import java.util.*; 

public class Employee{
	
	//Attributes
	
	private String name;
	private String charge;
	private String eMail;
	
	//Methods
	
	public Employee(String name, String charge, String eMail){
		this.name=name;
		this.charge=charge;
		this.eMail=eMail;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getCharge(){
		return charge;
	}
	
	public void setCharge(String charge){
		this.charge=charge;
	}	
	
	public String getEMail(){
		return eMail;
	}
	
	public void setEMail(String eMail){
		this.eMail=eMail;
	}
	
}