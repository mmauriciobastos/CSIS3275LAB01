import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab01Demo {

	public static void main(String[] args) {
		
		ArrayList<ProcessModel> Models = new ArrayList();
		
		String modelName, modelDescription;
		int option = 0;	
		 
		
		while(option == 0) {
						
			//Ask user if want to add a model. If no, the program ends			
			option = JOptionPane.showConfirmDialog(null,"Add a new model?", "Process Models", JOptionPane.YES_NO_OPTION);
			
			if(option == 0) {
			
			modelName = (JOptionPane.showInputDialog(null, "Insert the Model Name:"));
			modelDescription = (JOptionPane.showInputDialog(null, "Insert the Model Desc:"));
			
			ProcessModel temp = new ProcessModel();
			temp.setName(modelName);
			temp.setDescription(modelDescription);
			
			//Add pros
			int addPros = 0;			
			while (addPros == 0) {
				
				addPros = JOptionPane.showConfirmDialog(null,"Add Pros?", "Pros", JOptionPane.YES_NO_OPTION);
				
				if (addPros == 0) {
					
					String tempPro = (JOptionPane.showInputDialog(null, "Insert Pros:"));
					temp.setPros(tempPro);
					
				}//end of if				
				
			}//end of while
			
			
			//Add cons
			int addCons = 0;			
			while (addCons == 0) {
				
				addCons = JOptionPane.showConfirmDialog(null,"Add Cons?", "Cons", JOptionPane.YES_NO_OPTION);
				
				if (addCons == 0) {
					
					String tempCons = (JOptionPane.showInputDialog(null, "Insert Cons:"));
					temp.setCons(tempCons);
					
				}//end of if				
				
			}//end of while
			
			
			Models.add(temp);
			
			}//end of if			
			
		}//end of while option == 0 
		
		//Check if are there any models and display
		if(Models.size() > 0) {
			Models.forEach((model) -> model.displayDetails());
		}

	}//end of main

}//end of class
