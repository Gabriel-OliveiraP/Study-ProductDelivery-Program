package productDelivery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy");
		ArrayList<OrderItem> orderItem = new ArrayList<>();
		
		System.out.println("Enter client data:");
		System.out.println("Name:");
		String name = input.nextLine();
		System.out.println("Email:");
		String email = input.nextLine();
		System.out.println("Birth date: (dd/MM/yyyy)");
		String birthDate = input.nextLine();
		Client client = new Client(name, email, fmt.parse(birthDate));
		
		
		System.out.println("Enter order data:");
		System.out.println("Status:(PROCESSING, PENDING etc...)");
		String status = input.nextLine();
		System.out.println("How many items to this order?");
		int orderQuant = input.nextInt(); 
		input.nextLine();
		for(int i = 0; i < orderQuant; i++) {
			System.out.printf("Enter %d item data:%n", (i+1));
			System.out.println("Product name: ");
			String nameItem = input.nextLine();
			System.out.println("Product price:");
			double price = input.nextDouble();
			System.out.println("Quantity:");
			int quantity = input.nextInt();
			input.nextLine();
			
			OrderItem orderAdd = new OrderItem(nameItem, quantity, price);
			orderItem.add(orderAdd);
			
		}
		Date momment = new Date();
		OrderStatus o1 = OrderStatus.valueOf(status);
		Order order = new Order(momment, o1);
		System.out.println(order);
		System.out.println(client);
		System.out.println("Order items:");
		for(OrderItem x : orderItem) {
			System.out.print(x);
		}
		input.close();
	}
}
