import javax.swing.JOptionPane;

public class Lab01Demo {

	public static void main(String[] args) {
		
		boolean exit = false;
		String operation;
		int option = 1;
		
		 option = JOptionPane.showConfirmDialog(null,"Add a new model?", "Process Models", JOptionPane.YES_NO_OPTION);
		 
		 System.out.println("option: "+ option);
		 System.out.println("exit: "+ exit);
		
		 
		while(option == 0) {
			
			option = JOptionPane.showConfirmDialog(null,"Add a new model?", "Process Models", JOptionPane.YES_NO_OPTION);
			 
			 System.out.println("option: "+ option);
			 System.out.println("exit: "+ exit);
			
			
		}

	}

}
