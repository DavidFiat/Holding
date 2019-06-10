package model;
import java.util.*; 

public abstract class BusinessHolding extends LegalPersonality{

	//Relations
	private ArrayList<Company> companies;


	/**
	* Constructor method for class BusinessHolding. 
	* @param name  is a the holding's name.
	* @param nit is the holding's identification to DIAN.
	* @param address is the place where the holding is located.
	* @param phone is the principal holding's phone number.
	* @param actives are the holding's net earnings.
	* @param date is the holding's fundation date.
	* @param type is the holding's kind of company.
	* @param ownersName is the legal representer's name.
	* @param building is the building where the holding works.
	*/
public BusinessHolding(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
		
	companies=new ArrayList<Company>();
	
	
}
	
	/**
	* This method allows to get an ArrayList of companies. 
	* @return companies arraylist.
	*/
public ArrayList<Company> getCompanies(){
	return companies;
}
	
}