public class Pizza{
	boolean isVeg;
    int price;
    int cheesePrice=100;
	int toppingsPrice=200;
	boolean extraCheese=false;
	boolean extraToppings=false;
    public Pizza(Boolean isveg){
		this.isVeg=isVeg;
		this.price=isVeg?300:400;
	}
	public void addExtraCheese(){
		extraCheese=true;
		price+=cheesePrice;
	}
	public void addExtraToppings(){
		extraToppings=true;
		price+=toppingsPrice;
	}
	public void printBill(){
		System.out.println("---PizzaBill----");
		System.out.println("Base Pizza:"+(isVeg?"Vegetarian":"Non-Vegetarian"));
		System.out.println("Base Price:$"+(isVeg?300:400));
		if(extraCheese)
			System.out.println("extra Cheese:$"+cheesePrice);
		if(extraToppings)
			System.out.println("Extra Toppings:$"+toppingsPrice);
		System.out.println("/Total Price:$"+price);
		System.out.println("---------");
	}
}