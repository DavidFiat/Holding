package model;
import java.util.*; 

public class School extends EducationalCompany{
	
		//Attributes
		
	private int putSaber11;
		
		
		//Methods 
		
	public School(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building,
	String record, int acreditation, String rectorsName, int oneAndTwoStudentsNumber, int studentsNumer, int putSaber11){
	super(name,nit,address,phone,actives,date,type,ownersName,building, record, acreditation, rectorsName, oneAndTwoStudentsNumber,studentsNumer);
	this.putSaber11=putSaber11;
		
	}
	
	public int getPutSaber11(){
		return putSaber11;
	}
	public void setPutSaber11(int putSaber1){
		this.putSaber11=putSaber11;		
	}
}