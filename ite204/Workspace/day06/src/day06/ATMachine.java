package day06;
import javax.swing.*;
public class ATMachine {

	public static void main(String[] args) {
		
		String acctnum = JOptionPane.showInputDialog("Enter Account Number:");
		double userbal = Double.parseDouble(JOptionPane.showInputDialog("Enter Starting Balance:"));

		BankAccount useracct = new BankAccount(acctnum, userbal);
		
		String input = showMenu();
		
		while(!input.equalsIgnoreCase("q")){
			
			if(input.equalsIgnoreCase("d")){
				useracct.deposit(Double.parseDouble(JOptionPane.showInputDialog("Enter Deposit Amount: ")));
				JOptionPane.showMessageDialog(null, "Deposit Successful!\n\n" + useracct );
			
			}else if(input.equalsIgnoreCase("w")){
				
				if(useracct.withdraw(Double.parseDouble(JOptionPane.showInputDialog("Enter Withdrawal Amount:")))){
					JOptionPane.showMessageDialog(null, "Withdrawal Successful!\n\n" + useracct );
				}else{
					JOptionPane.showMessageDialog(null, "Sorry, Insufficent Funds" );
				}
			}else if(input.equalsIgnoreCase("v")){
				JOptionPane.showMessageDialog(null, useracct);
			}else{
				JOptionPane.showMessageDialog(null, "Invalid Input");
			}
			
			input = showMenu();
		}
		
	}
	
	public static String showMenu(){
		
		return JOptionPane.showInputDialog("Please select an option\n\n(d)eposit\n(w)ithdraw\n(v)iew balance\n(q)uit\n\n");
	}

}
