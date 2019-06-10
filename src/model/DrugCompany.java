package model;
import java.util.*;  

public class DrugCompany extends ManufacturingCompany{
	
	
	
	
	//Constants
	
	public static final String 	MANUFACTURE_EXPORT="Manufacture and export";
	public static final String MANUFACTURE_AND_SELL="Manufacture and sell";
	public static final String IMPORT_AND_SELL="Import and sell";

	
	
	//Attributes
	
	private String sanitaryRecord;
	private boolean status;
	private String expiration;
	private String modality;
	private double waterUSed;


	
	
	//Methods
	
	public DrugCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building,	String sanitaryRecord, boolean status, String expiration, String modality, double waterUSed){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	this.sanitaryRecord=sanitaryRecord;
	this.status=status;
	this.expiration=expiration;
	this.modality=modality;
	this.waterUSed=waterUSed;
	
	}
	
	public String getSanitaryRecord(){
		return sanitaryRecord;
	}
	public void setSaniratyRecord(String sanitaryRecord){
		this.sanitaryRecord=sanitaryRecord;
	}
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status){
		this.status=status;
	}
	public String getExpiration(){
		return expiration;
	}
	public void setExpiration(String expiration){
		this.expiration=expiration;
	}
	public String getModality(){
		return modality;
	}
	public void setModality(String modality){
		this.modality=modality;
	}
	public double getWaterUsed(){
		return waterUSed;
	}
	public void setWaterUsed(double waterUSed){
		this.waterUSed=waterUSed;
	}
	
	public String aguaXarbol(){
		
		String msg="The company must plant ";
		
		if ( 0<=waterUSed&&waterUSed<=140){
			
		msg+= "six trees on a year";
		
		}
		
		else if ( 141<=waterUSed&&waterUSed<=800){
			
		msg+= "twenty five trees on a year";
		
		}
		
		else if ( waterUSed>800){
			
		msg+= "two hundred trees on a year";
		
		}
		
		else if (waterUSed==0){
			
		msg= "The company does not have to plant any tree"	;
		}
		return msg;
	}
	
	
	
	
	
}