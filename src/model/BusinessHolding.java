package model;
import java.util.*; 

public abstract class BusinessHolding extends LegalPersonality{

	//Relations
	private ArrayList<Company> companies;


	
public BusinessHolding(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
		
	companies=new ArrayList<Company>();
	
	
}
	
public ArrayList<Company> getCompanies(){
	return companies;
}
	
}