package model;
import java.util.*; 

public class Building{
	
	//Constants
	
	public static final int MAX_CUBICLES=20;
	
	
	//Attributes
	
	private int floorsNumber;
	
	
	//Relations
	
	private Cubicle[][] cubicles;
	
	
	//Methods
	
	/**
	* Constructor method for class Building. 
	* @param floorsNumber are the number of floor the building has.

	*/
	public Building(int floorsNumber){
		this.floorsNumber=floorsNumber;
		this.cubicles=cubicles;
	
	cubicles= new Cubicle[floorsNumber][MAX_CUBICLES];
	
	}
	/**
	* This method allows to get the number of floors of the building. 
	* @return building floor's number.
	*/
	
	public int getFloorsNumber(){
		return floorsNumber;
		}
	
	public void setGetFloorsNumber(int floorsNumber){
		this.floorsNumber=floorsNumber;
	}
	
	public String searchingExtension(String name, String letter){
		String extension="";
		
		if (letter.equals("L")){
			
			
			for (int i=0;i<cubicles.length;i++){
				if(cubicles[i][0].getEmployee()!=null){
				if(name.equals(cubicles[i][0].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[i][0].getExtension();
					
				}
				
			}			
		}
			for (int i2=0;i2<cubicles[cubicles.length-1].length;i2++){
			if(cubicles[cubicles.length-1][i2].getEmployee()!=null){
				if(name.equals(cubicles[cubicles.length-1][i2].getEmployee().getName())){
				extension= name+"'s"+" extension is "+cubicles[cubicles.length-1][i2].getExtension();
			}
			}
			}
		}
				
		if (letter.equals("O")){
						
			for (int i=0;i<cubicles.length;i++){
				if(cubicles[i][0].getEmployee()!=null){
				if(name.equals(cubicles[i][0].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[i][0].getExtension();
					
				}
				
			}			
		}
			for (int i2=0;i2<cubicles[cubicles.length-1].length;i2++){
			if(cubicles[cubicles.length-1][i2].getEmployee()!=null){
				if(name.equals(cubicles[cubicles.length-1][i2].getEmployee().getName())){
				extension= name+"'s"+" extension is "+cubicles[cubicles.length-1][i2].getExtension();
			}
			}
			}
			
			for (int i3=0;i3<cubicles[0].length;i3++){
				if(cubicles[i3][cubicles.length-1].getEmployee()!=null){
				if(name.equals(cubicles[i3][cubicles.length-1].getEmployee().getName())){
				extension= name+"'s"+" extension is "+cubicles[i3][cubicles.length-1].getExtension();
			}
				}
			
			}		
		
			for (int i4=0;i4<cubicles.length;i4++){
				if(cubicles[0][i4].getEmployee()!=null){
				if(name.equals(cubicles[0][i4].getEmployee().getName())){
				extension= name+"'s"+" extension is "+cubicles[0][i4].getExtension();
			}
				}
			
			}	
		
		
		
		
	}
	
		if (letter.equals("X")){
			
			for(int i1=0;i1<cubicles.length;i1++){
				
				if(cubicles[i1][i1].getEmployee()!=null){
				if(name.equals(cubicles[i1][i1].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[i1][i1].getExtension();
					
				}
				
			}			
				
				
			}
			int i3=0;
			for (int i2=cubicles.length-1;i2>0;i2--){
				
				if(cubicles[i2][i3].getEmployee()!=null){
				if(name.equals(cubicles[i2][i3].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[i2][i3].getExtension();
					
				}
				
			}			
				
			}
			
			
			
		}
	
		if (letter.equals("Z")){
			for(int i1=0;i1<cubicles.length;i1++){
				if(cubicles[i1][i1].getEmployee()!=null){
				if(name.equals(cubicles[i1][i1].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[i1][i1].getExtension();
				}
			}			
		}	
			for (int i2=0;i2<cubicles.length;i2++){
					
				if(cubicles[0][i2].getEmployee()!=null){
				if(name.equals(cubicles[0][i2].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[0][i2].getExtension();
				}
			}	
			}
			for (int i3=0;i3<cubicles.length;i3++){
				if(cubicles[cubicles.length-1][i3].getEmployee()!=null){
				if(name.equals(cubicles[cubicles.length-1][i3].getEmployee().getName())){
					extension=name+"'s"+" extension is "+cubicles[cubicles.length-1][i3].getExtension();
				}
			}	
		}
	}
	
	return extension;
  }

	public String searchingMails(String charge){
		
		String mails="The mails of employees that have that charge are"+"\n";
		
			
		for (int i=0;i<cubicles.length;i++){
		if(i%2==0){
			
		for (int i1=0;i1<cubicles[0].length;i1++){
			if(cubicles[i][i1].getEmployee()!=null){
				if(charge.equals(cubicles[i][i1].getEmployee().getCharge())){
					mails+=cubicles[i][i1].getEmployee().getEMail()+"\n";
			
		}
		
		}
		}
			
}
	
		if(i%2!=0){
			
		for (int i1=cubicles[0].length-1;i1>0;i1--){
			if(cubicles[i][i1].getEmployee()!=null){
				if(charge.equals(cubicles[i][i1].getEmployee().getCharge())){
					mails+=cubicles[i][i1].getEmployee().getEMail()+"\n";
			
		}
		
		}
		}	
			
			
		}
		}
	 return mails;
	
	}

		
}
