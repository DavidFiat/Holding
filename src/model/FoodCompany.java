package model;
import java.util.*; 

public class FoodCompany extends ManufacturingCompany{
	
	
	//Constants
	
	public static final int DESTROY_BACTERIUM=1;
	public static final int INHIBIT_BACTERIUM=2;
	public static final int DO_NOT_APPLY=3;
	public static final char MEAT_INDUSTRY='N';
	public static final char FISH_INDUSTRY='P';
	public static final char FRUITS_INDUSTRY='F';
	public static final char MILKY_INDUSTRY='U';
	public static final char SUGARS_INDUSTRY='Z';
	public static final char ALCOHOL_INDUSTRY='H';
	
	
	//Attributes
	
	private boolean sanitaryStatus;
	private int starsNumber;
	private int methodOfConservation;
	private char industry;
	
	
	//Methods
	
	public FoodCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building, boolean sanitaryStatus, int starsNumber, int methodOfConservation, char industry){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	this.sanitaryStatus=sanitaryStatus;
	this.starsNumber=starsNumber;
	this.methodOfConservation=methodOfConservation;
	this.industry=industry;
	}
	
	public boolean getSanitaryStatus(){
		return sanitaryStatus;
	}
	public void setSanitaryStatus(boolean sanitaryStatus){
		this.sanitaryStatus=sanitaryStatus;
	}
	public int getStarsNumber(){
		return starsNumber;
	}
	public void setStarsNumber(int starsNumber){
		this.starsNumber=starsNumber;
	}
	public int getMethodOfConservation(){
		return methodOfConservation;
	}
	public void setMethodOfConservation(int methodOfConservation){
		this.methodOfConservation=methodOfConservation;
	}
	public char getIndustry(){
		return industry;
	}
	public void setIndustry(char industry){
		this.industry=industry;
	}
	
	
	
	
	
	
	
	
}