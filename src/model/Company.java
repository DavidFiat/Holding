package model;
import java.util.*; 


public abstract class Company extends LegalPersonality{
	
public Company(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
		
	
}
}