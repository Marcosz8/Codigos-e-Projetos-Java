package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        //== CREATING THE CLIENT == \\
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        String birthDateStr = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr, fmt1);
        Client client = new Client(name, email, birthDate);
        
        // == INSTANTIANG THE CURRENT DATE AND STATUS == \\
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        Instant moment = Instant.now();
        Order order = new Order(moment, status, client);

        // == INSERTING PRODUCTS AND ADDING THEM TO THE ARRAY== \\
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            Product product = new Product(productName,price);
            OrderItem item = new OrderItem(quantity,price,product);
            order.addItem(item);            
        }   
        
        // == PRESENTING ORDER INFORMATION == \\
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        
        sc.close();        
    }
}
