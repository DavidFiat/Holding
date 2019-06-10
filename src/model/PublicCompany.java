package model;
import java.util.*; 

public class PublicCompany extends ServicesCompany{
	
	//Constants
	
	public static final char SEWERAGE='W'; 
	public static final char ENERGY='E'; 
	public static final char AQUEDUCT='D';


	
	//Attributes

	private char serviceType;
	private int subscribersNumber;
	private int oneAndTwoSuscribersNumber;
	
	//Methods
	
	public PublicCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building, char serviceType, int subscribersNumber, int oneAndTwoSuscribersNumber){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	this.serviceType=serviceType;
	this.subscribersNumber=subscribersNumber;
	this.oneAndTwoSuscribersNumber=oneAndTwoSuscribersNumber;
	
	
	}
		
	public char getServiceType() {
		return serviceType;
	}
	
	public void setServiceType(char serviceType) {
		this.serviceType = serviceType;
	}

	public int getSubscribersNumber() {
		return subscribersNumber;
	}
	
	public void setSubscribersNumber(int subscribersNumber) {
		this.subscribersNumber = subscribersNumber;
	}

	public int get1and2subscribersNumber() {
		return oneAndTwoSuscribersNumber;
	}
	
	public void set1and2SubscribersNumber(int oneAndTwoSuscribersNumber) {
		this.oneAndTwoSuscribersNumber = oneAndTwoSuscribersNumber;
	}

	public int threeFourFiveAndSixSubscribersNumber(){
		
		int value=(subscribersNumber-oneAndTwoSuscribersNumber);
	return value;		
		
	}
	
	public String proculture(){
		String msg="The percentage to pay about proculture tax is ";
		double proculturePercentage=0.0;
		double percentage= (threeFourFiveAndSixSubscribersNumber()/subscribersNumber)*100;
			if ((40-percentage)>=0){
				proculturePercentage=(40-percentage);	
					msg+= percentage+"%";
			}
			else{
			proculturePercentage=0.0;
				msg="The company does not have to pay proculture tax";
			}
			return msg;
	}
	
	
}