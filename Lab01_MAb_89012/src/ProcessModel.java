import java.util.ArrayList;

public class ProcessModel {


	private String name;
	private String description;
	private ArrayList<String> pros = new ArrayList();
	private ArrayList<String> cons = new ArrayList();
	
	public ProcessModel() {
		
	}
	
	public ProcessModel(String ModelName, String ModelDescription) {
		name = ModelName;
		description = ModelDescription;
	}
	
	public void setName(String ModelName) {
		name = ModelName;
	}
	
	public void setDescription(String ModelDescription) {
		description = ModelDescription;
	}
	
	public void setPros(String ModelPros) {
		pros.add(ModelPros);
	}
	
	public void setCons(String ModelCons) {
		cons.add(ModelCons);
	}

	
	public void displayDetails() {
		
		String modelString;
		
		 System.out.println("----------------------");	
		 System.out.println("Model Name: "+ name);
		 System.out.println("Description: "+ description);
		 
		 
		 if(pros.size() > 0) {
			 System.out.println(name+ " Pros:");
			 pros.forEach((pro) -> System.out.println("    * "+pro));
		 }
		 
		 if(cons.size() > 0) {
			 System.out.println(name+ " Cons:");
			 cons.forEach((con) -> System.out.println("    * "+con));
		 }
		 
		 
		 
		}

}
