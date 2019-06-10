package model;
import java.util.*; 

public class Poll{
	//Attributes
	
	private int question1;
	private int question2;
	private int question3;
	
	//Methods
	
	public Poll(int question1, int question2, int question3){
	this.question1=question1;
	this.question2=question2;
	this.question3=question3;
	}
	
	public int getQuestion1() {
		return question1;
	}
	
	public void setQuestion1(int question1) {
		this.question1 = question1;
	}
	
	public int getQuestion2() {
		return question2;
	}
	
	public void setQuestion2(int question2) {
		this.question2 = question2;
	}
	
	public int getQuestion3() {
		return question3;
	}
	
	public void setQuestion3(int question3) {
		this.question3= question3;
	}
	
}