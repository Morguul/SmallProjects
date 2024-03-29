
public abstract class CreditCard {
	
	private String idnum;
	private Money balance;
	
	public CreditCard(String idnum){
		this.idnum = idnum;
		this.balance = new Money("$0.00");
	}
	
	public CreditCard(){
		this("000000");
	}
	
	public String getIDnum(){
		return this.idnum;
	}
	
	public Money getBalance(){
		return this.balance;
	}
	
	public void setBalance(Money newBalance){
		this.balance = newBalance;
	}
	
	public boolean payCard(Money payamt){
		if(payamt.compare(this.balance) <= 0){
			this.balance = this.balance.subMoney(payamt);
			return true;
		}else{
			return false;
		}
	}
	
	public abstract void chargeCard(Money chargeamt);
	
	public String toString(){
		if(this instanceof MasterCrook){
			return "Card: Master Crook" +
					"\nService Multipler: " + ((MasterCrook)this).getServiceFee() +
					"\nBalance: " + this.getBalance();
		}else{
			return "Card: Dishonest Express" +
					"\nInterest: " + ((DishonestExpress)this).getInterest() +
					"\nBalance: " + this.getBalance();
		}
	}
}
