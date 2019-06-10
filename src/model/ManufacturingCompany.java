package model;
import java.util.*; 


public abstract class ManufacturingCompany extends Company{
	
	
	//Relations
	private ArrayList<Product> products;

	
	
	
public ManufacturingCompany(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building){
	super(name,nit,address,phone,actives,date,type,ownersName,building);
	products= new ArrayList<Product>();
	
	
	}
	
	
	public ArrayList<Product> getProduts(){
	return products;
	}
	
	
	
	
}