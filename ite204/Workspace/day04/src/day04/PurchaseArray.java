package day04;
import javax.swing.*;

public class PurchaseArray {
	public static void main(String[] args){
		String[] products = {"RAM", "Graphics Card", "Hard Drive", "Mouse", "Fans"};
		double[] prices = {89.99, 249.99, 199.99, 1200.99, 10.99};
		int[] quantities = {45, 9, 50, 200, 80};
		String msg = "";
		
		int menuChoice = showMenu(products, prices);
		
		while(menuChoice != -2){
			
			if(menuChoice == -1){
				msg = "";
				for(int i = 0; i < products.length; i++){
					
					msg += products[i] + " " + quantities[i] + "\n";
				}
			}else if(menuChoice >= 0 && menuChoice <= products.length){
				
				int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
				
				while(quantity > quantities[menuChoice]){
					quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter a valid quantity"));
				}
				
				double total = prices[menuChoice] * quantity;
				
				msg = "";
				msg += "Here is your order summary\n\n";
				msg += "product: " + products[menuChoice] + "\n";
				msg += "price: $" + prices[menuChoice] + "\n";
				msg += "total: $" + total;
			}
			JOptionPane.showMessageDialog(null, msg);
			menuChoice = showMenu(products, prices);
			
		}
		
	}
	
	public static int showMenu(String[] products, double[] prices){
		
		String msg = "Please Choose an option:\n\n";
		msg += "-2 to quit\n -1 to show inventory\n\n";
		
		for(int i = 0; i < products.length; i++){
			msg += i + " " + products[i] + " $" + prices[i] + "\n";
		}
		
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
}
