public class AtmOperationImpl implements AtmOperationInterface
{
	private double balance=1000;
@Override
public void viewBalance(){
System.out.println("Balance is :"+balance);
}
@Override
public void withdrawAmount(double amount){
if(amount<=balance){
	balance-=amount;
	System.out.println("withdraw:"+amount);
	viewBalance();
}
else
{
	System.out.println("Insufficient balance!");
}
}
@Override
public void depositAmount(double amount){
balance+=amount;
System.out.println("Deposited:"+amount);
}
@Override
public void viewMiniStatement(){
	System.out.println("Mini Statement: [this is a dummy implimentation]");
	}
}	