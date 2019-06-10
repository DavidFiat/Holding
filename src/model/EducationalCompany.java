package model;
import java.util.*; 


public abstract class EducationalCompany extends ServicesCompany{
	
	//Attributes
	private String record;
	private int acreditation;
	private String rectorsName;
	private int oneAndTwoStudentsNumber;
	private int studentsNumber;
	
	
	//Methods
	
	public EducationalCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building,String record, int acreditation, String rectorsName, int oneAndTwoStudentsNumber, int studentsNumber){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	this.record=record;
	this.acreditation=acreditation;
	this.rectorsName=rectorsName;
	this.oneAndTwoStudentsNumber=oneAndTwoStudentsNumber;
	this.studentsNumber=studentsNumber;
	}
	
	public String getRecord(){
		return record;
	}
	
	public void setRecord(String record) {
		this.record = record;
	}
	
	public int getAcreditation(){
		return acreditation;
	}
	
	public void setAcreditation(int acreditation) {
		this.acreditation = acreditation;
	}
	
	public String getRectorsName(){
		return rectorsName;
	}
	
	public void setRectorsName(String rectorsName) {
		this.rectorsName = rectorsName;
	}
	
	public int get1and2StudentsNumber(){
		return oneAndTwoStudentsNumber;
	}
	
	public void set1and2StudentsNumber(int oneAndTwoStudentsNumber) {
		this.oneAndTwoStudentsNumber = oneAndTwoStudentsNumber;
	}
	
	public int getStudentsNumber(){
		return studentsNumber;
	}
	
	public void setStudentsNumber(int studentsNumber) {
		this.studentsNumber = studentsNumber;
	}

	public String proculture(){
		String msg="The percentage to pay about proculture tax is ";
		double proculturePercentage=0.0;
		double percentage= (oneAndTwoStudentsNumber/studentsNumber)*100;
			if ((20-percentage)>=0){
				proculturePercentage=(20-percentage);	
					msg+= percentage+"%";
			}
			else{
			proculturePercentage=0.0;
				msg="The company does not have to pay proculture tax";
			}
			return msg;
	}






}



	
	
	
	