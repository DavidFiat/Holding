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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNit() {
		return nit;
	}
	
	public void setNit(String nit) {
		this.nit = nit;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public double getActives() {
		return actives;
	}
	
	public void setActives(double actives) {
		this.actives = actives;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public char getType() {
		return type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public String getOwnersName() {
		return ownersName;
	}
	
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	
	public Building building() {
		return building;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
}

