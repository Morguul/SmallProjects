
public class TestMoney {

	public static void main(String[] args) {
		
		Money mikeMoney = new Money(12, 34);
		
		System.out.println(mikeMoney);
		
		mikeMoney = mikeMoney.addMoney(new Money(50,50));
		
		System.out.println(mikeMoney);
		
		Money cassMoney = new Money("$45.99");

	}

}
