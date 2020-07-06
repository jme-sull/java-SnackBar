package snackbar;

public class Main 
{
	private static void workwithData()

	{
		//public Customer(String name, double cash)
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		//public Vendingmachine(String name)
		Vendingmachine food = new Vendingmachine("Food");
		Vendingmachine drink = new Vendingmachine("Drink");
		Vendingmachine office = new Vendingmachine("Office");

		//Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());


		//processing 
		
		jane.buySnacks(soda.getTotal(3));
		soda.buySnack(3);
		System.out.println("Jane cash on hand $" + jane.getCash());
		System.out.println("Quantity of soda is " + soda.getQuantity());

		jane.buySnacks(pretzel.getTotal(1));
		pretzel.buySnack(1);
		System.out.println("Jane cash on hand $" + jane.getCash());
		System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

		bob.buySnacks(soda.getTotal(2));
		soda.buySnack(2);
		System.out.println("Bob cash on hand $" + bob.getCash());
		System.out.println("Quantity of soda is " + soda.getQuantity());

		jane.addCash(10.00);
		System.out.println("Jane cash on hand $" + jane.getCash());

		jane.buySnacks(chocolate.getTotal(1));
		chocolate.buySnack(1);
		System.out.println("Jane cash on hand $" + jane.getCash());
		System.out.println("Quantity of chocolate is " + chocolate.getQuantity());

		pretzel.addQuantity(12);
		System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

		bob.buySnacks(pretzel.getTotal(3));
		pretzel.buySnack(3);
		System.out.println("Bob cash on hand $" + bob.getCash());
		System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

		System.out.println(chips);
		System.out.println(chocolate);
		System.out.println(pretzel);
		System.out.println(soda);
		System.out.println(water);


	}

	public static void main(String args[])
	{
		workwithData();
	}
}