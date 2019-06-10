package ui;
import java.util.*; 
import model.*;

public class Main{
	
	
	private LegalPersonality legalPersonality;
	private Scanner reader;
	
	
	
	public Main(){
		
		init();
		reader = new Scanner (System.in);
 
	}
	
	public void init(){
	}
	
	public static void main(String[] args) {

		Main m = new Main();
		m.showMenu();


			
		
	}
	
	
	
	
	
	public void showMenu(){
		int option = 0;
		while (option != 10){
			

			
					
			
		System.out.println("Welcome to the holding");	
		System.out.println("1.To register a new company");	
		System.out.println("2.To show all the information");	
		System.out.println("3.To hire a new employee");
		System.out.println("4.To search an extension");	
		System.out.println("5.To search all E-Mails of a charge");	
		System.out.println("6.To show the number of a company's employees");
		System.out.println("7.To make a survey");	
		System.out.println("8.To show the satisfaction level");	
		System.out.println("9.To exit"+"\n"+"\n");
	
					
		option = reader.nextInt();	
					
		  switch (option){
              
               case (1):
			   
					
				
				break;
			
			   
			   case (2):
			   
				
				break;
				
				case (3):
				
			 
                break;
				  
				case (4):
				
			  
                break;
             			  
			  
			   case (5):
			   
			  
                break;	

				
				case(6):
				
			
				break;

				case (7):
				
			
			    break;
			}
		
		
				
		

			
		}
		
		
		
		
		
		
	}
	
	


	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
