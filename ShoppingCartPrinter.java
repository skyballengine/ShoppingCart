import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;


public class ShoppingCartPrinter {
    
   public static int getInt(Scanner scnr) {
       return scnr.nextInt();
   }
   
   public static String getString(Scanner scnr) {
       return scnr.next();
   }
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
      int product1Cost = 0;
      int product2Cost = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = getString(scnr);
      
      System.out.println("Enter the item price: ");
      productPrice = getInt(scnr);
      
      System.out.println("Enter the item quantity: ");
      productQuantity = getInt(scnr);
      
      item1.setName(productName);
      item1.setPrice(productPrice);
      item1.setQuantity(productQuantity);
      product1Cost = item1.getPrice() * item1.getQuantity();
      
      //Newline
      System.out.println();
 
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      productName = getString(scnr);
      
      
      
      System.out.println("Enter the item price: ");
      productPrice = getInt(scnr);
      
     
      
      System.out.println("Enter the item quantity: ");
      productQuantity = getInt(scnr);
     
      
      item2.setName(productName);
      item2.setPrice(productPrice);
      item2.setQuantity(productQuantity);
      product2Cost = item2.getPrice() * item2.getQuantity();
      
      // Add costs of two items and print total
      System.out.println("TOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + product1Cost);
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + product2Cost);
      
      // cartTotal = item one price + item two price
      cartTotal = item1.getPrice() + item2.getPrice();
      
      // Total Cost
      System.out.println("Total: $" + cartTotal);
      
      // item one information
      // item two information
      // Total output
      
      return;
   }
}