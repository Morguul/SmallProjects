package day03;

import javax.swing.JOptionPane;

public class ArrayFun {
	public static void main(String[] args){
		
		int[] numlist = new int[5];
		
		for(int i = 0; i < numlist.length; i++ ){
			
			numlist[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number " + (i+1)));
		}
		
		String msg = "";
		for(int i = 0; i < numlist.length; i++ ){
			msg += numlist[i] + "\n";
		}
		
		
		int max = numlist[0];
		for(int i = 1; i < numlist.length; i++ ){
			if(numlist[i] > max){
				max = numlist[i];
			}
		}
		msg += "The max is " + max + "\n";
		
		
		int sum = 0;
		for(int i = 0; i < numlist.length; i++){
			sum += numlist[i];
		}
		
		msg += "The sum is " + sum;
		
		JOptionPane.showMessageDialog(null, msg);
		
		
	}
}
