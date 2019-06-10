package model;
import java.util.*; 

public class TechnologicalCompany extends ServicesCompany{




	//Attributes
	
	private String service;
	private double energyUsed ;



	public TechnologicalCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building, String service, double energyUsed){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	this.service=service;
	this.energyUsed=energyUsed;
	
	
	}


	public String getService() {
		return service;
	}
	
	public void setService(String service) {
		this.service = service;
	}

	public double getEnergyUsed() {
		return energyUsed;
	}
	
	public void setEnergyUsed(double energyUsed) {
		this.energyUsed= energyUsed;
	}

	public String energiaXarbol(){
		
		String msg="The company must plant ";
		
		if ( 1<=energyUsed&&energyUsed<=1000){
			
		msg+= "eight trees on a year";
		
		}
		
		else if ( 1001<=energyUsed&&energyUsed<=3000){
			
		msg+= "thirty five trees on a year";
		
		}
		
		else if ( energyUsed>3000){
			
		msg+= "five hundred trees on a year";
		
		}
		
		else if (energyUsed==0){
			
		msg= "The company does not have to plant any tree";
		}
		return msg;
	}

}