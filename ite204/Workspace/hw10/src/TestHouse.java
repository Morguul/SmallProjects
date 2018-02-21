
public class TestHouse {

	public static void main(String[] args) {
		
		House[] houses = new House[3];
		houses[0] = new Owned(200, 300, 3, new Money("$200.00"));
		houses[1] = new Owned(300, 190, 2, new Money("$250.00"));
		houses[2] = new Rental(200, 150, 1, new Money("$10.00"), new Money("$100.00"));
		
		System.out.println(houses[0].toString());
		
		for(int i = 0; i < houses.length; i++){
			
			if(houses[i] instanceof Owned){
				System.out.println("Tax amount: " + ((Owned)houses[i]).getTaxAmt());
			}else{
				System.out.println("Utility cost: " + ((Rental)houses[i]).getUtilities());
			}
		}
		
		Money max = houses[0].computeFee();
		for(int i = 1; i < houses.length - 1; i++){
			if(houses[i].computeFee().compareMoney(houses[i+1].computeFee()) > 0){
				max = houses[i].computeFee();
			}
		}
		System.out.println(max);

	}

}
