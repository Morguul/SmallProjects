
public class TestMoneyReturns {
	public static void main(String[] args){
		
		Money waqasMoney = new Money(100, 00);
		Money laurenMoney = new Money(150, 75);
		
		Money betMoney = new Money(15, 10);
		
		System.out.println("Before payoff\nWaqas has " + waqasMoney + "\nLauren has " + laurenMoney);
		laurenMoney = laurenMoney.addMoney(betMoney);
		waqasMoney = waqasMoney.subMoney(betMoney);
		
		System.out.println("After payoff\nWaqas has " + waqasMoney + "\nLauren has " + laurenMoney);
	}
}
