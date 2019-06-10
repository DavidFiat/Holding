package model;
import java.util.*; 

public class University extends EducationalCompany{
	
		//Attributes
		
		private int putSaberPro;
		
		
		//Methods 
		
		
		
	public University(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building,String record, int acreditation, String rectorsName, int oneAndTwoStudentsNumber, int studentsNumer, int putSaberPro){
	super(name,nit,address,phone,actives,date,type,ownersName,building, record, acreditation, rectorsName, oneAndTwoStudentsNumber,studentsNumer);
	this.putSaberPro=putSaberPro;
		
	}
	
	public int getPutSaberPro(){
		return putSaberPro;
	}
	public void setPutSaberPro(int putSaberPro){
		this.putSaberPro=putSaberPro;		
	}
	
	

}




