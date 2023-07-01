package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.Enum.OrderStatus;

public class Maini {

	public static void main(String[] args) throws DateTimeParseException {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Order order = new Order();
		Client client = new Client();
		Product product = new Product();
		OrdemItem item = new OrdemItem();
		
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String dataBirth = sc.nextLine();
		LocalDate birth = LocalDate.parse(dataBirth, fmt1);
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		LocalDateTime moment = LocalDateTime.now();
		client = new Client(name, email, birth);
		order = new Order(moment, status, client);
		
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			product = new Product(nameProduct, price);
			item = new OrdemItem (quantity, price);
			
			item.setProduct(product);
			order.addItem(item);
			
		}
		System.out.println();
		
		System.out.println("Order Summary: ");
		System.out.println("Order Moment " + order.getMoment());
		System.out.println("Order statud: " + order.getStatus());
		System.out.println(client);
		for(OrdemItem items : order.getListItem()) {
			System.out.println(items);
		}
		System.out.println(order);
		sc.close();
	}

}
