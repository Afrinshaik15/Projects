public class Main{
public static void main(String[] args){
AtmOperationInterface atm=new AtmOperationImpl();
atm.viewBalance();
atm.depositAmount(500);
atm.withdrawAmount(200);
atm.viewMiniStatement();
}
}