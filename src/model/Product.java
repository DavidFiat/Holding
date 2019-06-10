package model;
import java.util.*; 

public class Product{
	
	
	//Attributes
	
	private String name;
	private String code;
	private double waterQuantity;
	private int unitsNumber;
	
	
	//Methods
	
	public Product(String name, String code, double waterQuantity, int unitsNumber){
		this.name=name;
		this.code=code;
		this.waterQuantity=waterQuantity;
		this.unitsNumber=unitsNumber;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public double getWaterQuantity() {
		return waterQuantity;
	}
	
	public void setWaterQuantity(double name) {
		this.waterQuantity = waterQuantity;
	}
	public int getUnitsNumber() {
		return unitsNumber;
	}
	
	public void setUnitsNumber(int unitsNumber) {
		this.unitsNumber=unitsNumber;
	}
	
	
	
	
	
}