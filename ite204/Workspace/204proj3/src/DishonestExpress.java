
public class DishonestExpress extends CreditCard{
	
	private int interest;
	
	public DishonestExpress(String idnum, int interest){
		super(idnum);
		this.interest = interest;
	}
	
	public DishonestExpress(){
		this.interest = 2;
	}
	
	public int getInterest(){
		return this.interest;
	}
	
	public void chargeCard(Money chargeamt){
		this.setBalance(this.getBalance().addMoney(chargeamt.addMoney(chargeamt.multiply(this.interest))));
	}
}
