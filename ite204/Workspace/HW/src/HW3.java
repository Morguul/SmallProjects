import javax.swing.*;

public class HW3 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter num" + (i + 1)));
		}
		
		int max = nums[0];
		int min = nums[0];
		
		for(int i = 1; i < nums.length; i++){
			if(nums[i] > max){
				
				max = nums[i];
			
			}else if(nums[i] < min){
				
				min = nums[i];
				
			}
		}
		
		String msg = "";
		for(int i = 0; i < nums.length; i++){
			msg += nums[i] + "\n";
		}
		
		msg += "The max is " + max + "\nThe min is " + min;
		
		JOptionPane.showMessageDialog(null, msg);
		
		msg = "";
		
		for(int i = min; i <= max; i++){
			msg += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
		msg = "\n" + ((Math.random() * 100) + 1);
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
