import javax.swing.*;

public class MockLogin {
	
	public static void main(String[] args){
		
		String[] usernames = {"Jeff", "Steven", "Bill", "Stan", "Ford"};
		String[] passwords = {"password", "fido", "1969", "floyd", "dipper"};
		int[] numlogs = {0, 0, 0, 0, 0};
		
		boolean success = false;
		String input = showMenu();
		String username = "";
		String password = "";
		
		while(!input.equals("q")){
			
			if(input.equals("l")){
				
				username = JOptionPane.showInputDialog("Enter Username:");
				
				for(int i = 0; i < usernames.length; i++){
					
					if(username.equals(usernames[i])){
						
						password = JOptionPane.showInputDialog("Enter Password:");
						
						if(password.equals(passwords[i])){
							
							numlogs[i]++;
							JOptionPane.showMessageDialog(null, "You are logged in!\n" + "Total logins is: " + numlogs[i]);
							success = true;
							break;
						}
					}
				}
			}
			
			if(!success)
				JOptionPane.showMessageDialog(null, "Invalid Input, try again");
			
			success = false;
			input = showMenu();
		}
	}
	
	public static String showMenu(){
		return JOptionPane.showInputDialog("Select an option:\n\n(l)ogin\n(q)uit");
	}
}
