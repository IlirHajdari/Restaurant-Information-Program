import java.util.Scanner;
public class Mod1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the restaurant name: ");
		String name = scanner.nextLine();
		
		System.out.println("The restaurant name is: "+name);
		System.out.println();
		
		System.out.println("Enter the restaurant address: ");
		String address = scanner.nextLine();
		
		System.out.println("The restaurant address is: "+address);
		System.out.println();
		
		System.out.println("Enter the restaurant city: ");
		String city = scanner.nextLine();
		
		System.out.println("Enter the restaurant state: ");
		String state = scanner.nextLine();
		 
		System.out.println("Enter the restaurant zip code: ");
		String zip = scanner.nextLine();
		
		System.out.println("Restaurant state information is: " + city + ", " + state + ", " + zip);
		System.out.println();
		
		scanner.close();
	}
}