import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("do you want aveg Pizza?(yes/no):");
		String vegChoice=sc.nextLine().toLowerCase();
		boolean isVeg=vegChoice.equals("yes");
		Pizza pizza=new Pizza(isVeg);
		System.out.println("do you want extra cheese?(yes/no):");
		if(sc.nextLine().toLowerCase().equals("yes")){
			pizza.addExtraCheese();
		}
		System.out.println("do you want extra toppings?(yes/no):");
		if(sc.nextLine().toLowerCase().equals("yes")){
			pizza.addExtraToppings();
		}
		pizza.printBill();
		sc.close();
	}
}