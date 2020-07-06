package snackbar;

public class Main 
{
	private static void workwithData()

	{
		String hello = "hello";
		System.out.println(hello);

//Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, 1);
		System.out.println(chips);

	}

	public static void main(String args[])
	{
		workwithData();
	}
}