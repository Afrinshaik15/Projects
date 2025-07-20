
import java.util.Scanner;
public class MainClass{
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
int storedAtmNumber=12345;
int storedpin=123;
System.out.println("Enter Atm Number :");
int inputAtmNumber=in.nextInt();
System.out.println("Enter pin:");
int pin=in.nextInt();
if(inputAtmNumber==storedAtmNumber && pin==storedpin){
	AtmOperationInterface op= new AtmOperationImpl();
    while(true){
	    System.out.println("1,view Available Balance\n2.withdraw Amoount\n3.Deposite Amount\n4.view ministatement\n5.Exit");
	    System.out.println("Enter choice:");
	    int choice=in.nextInt();
	    switch(choice){
		    case 1:
			    op.viewBalance();
		        break;
            case 2:
	            System.out.print("enter amount to withdraw:");
	            double withdrawAmount=in.nextDouble();
	            op.withdrawAmount(withdrawAmount);
                break;
            case 3:
	            System.out.print("enter amount to the deposit:");
	            int depositAmount=scanner.nextInt();
	            op.depositAmount(depositAmount);
                break;
            case 4:
	            op.viewMiniStatement();
                break;
            case 5:
	            System.out.println("collect  your Atm card\n Thankyou for using Atm Machine");
	            System.exit(0);
                break;
            default:
	            System.out.println("invalid choice.please try again.");
        }
    }
}
}
}