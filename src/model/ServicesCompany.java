package model;
import java.util.*; 

public abstract class ServicesCompany extends LegalPersonality{
	
		//Constants
		
		public static final int MAX_POLLS=50;
	
		//Relations
		
		private Poll[] polls;
	
	
public ServicesCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	polls= new Poll[MAX_POLLS];
	
}
public Poll[] getPolls(){
	return polls;
		}
		
		
		
}


