package model;
import java.util.*; 
public abstract class LegalPersonality{
	
	//Constants
	
	public static final char AGRI_HUNT_FISH='A';
	public static final char MINES='M';
	public static final char MANUFACTURATION='R';
	public static final char ELEC_GAS_VAP='V';
	public static final char CONSTRUCTION='C';
	public static final char TRANSPORTATION_COM='T';
	public static final char COMMUNAL_SOCIAL='S';
	
	//Attributes
	
	private String name;
	private String nit;
	private String address;
	private int phone;
	private double actives;
	private String date;
	private char type;
	private String ownersName; 
	
	//Relations
	private Building building;
	
	
	//Methods
	
	/**
	* Constructor method for the abstract class LegalPersonality. 
	* @param name  is a the legal personality's name.
	* @param nit is the legal personality's identification to DIAN.
	* @param address is the place where the legal personality is located.
	* @param phone is the principal legal personality's phone number.
	* @param actives are the legal personality's net earnings.
	* @param date is the legal personality's fundation date.
	* @param type is the legal personality's kind of company.
	* @param ownersName is the legal representer's name.
	* @param building is the building where the legal personality works.
	*/
	public LegalPersonality(String name,String nit, String address, int phone, double actives, String date, char type, String ownersName, Building building){
	this.name=name;
	this.nit=nit;
	this.address=address;
	this.phone=phone;
	this.actives=actives;
	this.date=date;
	this.type=type;
	this.ownersName=ownersName;
	this.building=building;
	}
	
	/**
	* This method allows to get the legal personality's name. 
	* @return legal personality's name.
	*/
	public String getName() {
		return name;
	}
	/**
	* This method allows to change legal personality's name.
	* pre  : the param is different to null.
	* post: The legal personality's name is changed.
	* @param name is legal personality's name.
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**
	* This method allows to get the legal personality's nit. 
	* @return legal personality's nit.
	*/
	public String getNit() {
		return nit;
	}
	/**
	* This method allows to change legal personality's nit.
	* pre  : the param is different to null.
	* post: The legal personality's nit is changed.
	* @param nit is legal personality's identification to the DIAN.
	*/
	public void setNit(String nit) {
		this.nit = nit;
	}
	/**
	* This method allows to get the legal personality's address. 
	* @return legal personality's address.
	*/
	public String getAddress() {
		return address;
	}
	/**
	* This method allows to change legal personality's address if they decides to move.
	* pre  : the param is different to null.
	* post: The legal personality's address is changed.
	* @param address is legal personality's location.
	*/
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	* This method allows to get the legal personality's phone. 
	* @return legal personality's phone.
	*/
	public int getPhone() {
		return phone;
	}
	/**
	* This method allows to change legal personality's phone number.
	* pre  : the param is different to null.
	* post: The legal personality's phone number is changed.
	* @param phone is legal personality's phone.
	*/
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/**
	* This method allows to get the legal personality's actives. 
	* @return legal personality's actives.
	*/
	public double getActives() {
		return actives;
	}
	/**
	* This method allows to change legal personality's actives.
	* pre  : the param is different to null.
	* post: The legal personality's name is changed.
	* @param actives is legal personality's net earnings.
	*/
	public void setActives(double actives) {
		this.actives = actives;
	}
	/**
	* This method allows to get the legal personality's date. 
	* @return legal personality's date.
	*/
	public String getDate() {
		return date;
	}
	/**
	* This method allows to change the legal personality's date.
	* pre  : the param is different to null.
	* post: The legal personality's date is changed.
	* @param date is legal personality's namme. This param must be in a format (day/month/year).
	*/
	public void setDate(String date) {
		this.date = date;
	}
	/**
	* This method allows to get the legal personality's type. 
	* @return legal personality's type.
	*/
	public char getType() {
		return type;
	}
	/**
	* This method allows to change legal personality's type.
	* pre  : the param is different to null.
	* post: The legal personality's type is changed.
	* @param type is legal personality's type of company.
	*/
	public void setType(char type) {
		this.type = type;
	}
	/**
	* This method allows to get the legal personality's owner's name. 
	* @return legal personality's owner's name.
	*/
	public String getOwnersName() {
		return ownersName;
	}
	/**
	* This method allows to change legal personality's owner's name if he has passed away.
	* pre  : the param is different to null.
	* post: The legal personality's owner's name is changed.
	* @param ownersName is legal personality's owner's name.
	*/
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	/**
	* This method allows to get the legal personality's building. 
	* @return legal personality's building.
	*/
	public Building building() {
		return building;
	}
	/**
	* This method allows to change legal personality's building if maybe the company build more cubicles.
	* pre  : the param is different to null.
	* post: The legal personality's building is changed.
	* @param building is legal personality's building.
	*/
	public void setBuilding(Building building) {
		this.building = building;
	}
}

