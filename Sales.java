import java.util.Scanner;

public class Sales
{
   //scanner for input
   Scanner input = new Scanner(System.in);
   
   //variable declaration product prices
   private double price1 = 2.98;
   private double price2 = 4.50;
   private double price3 = 3.98;
   private double price4 = 4.49;
   private double price5 = 6.87;
   //variable declaration quantity of products
   private int qty1 = 0;
   private int qty2 = 0;
   private int qty3 = 0;
   private int qty4 = 0;
   private int qty5 = 0;
   //variable declaration sales of quantity of a product
   private double sales1 = 0;
   private double sales2 = 0;
   private double sales3 = 0;
   private double sales4 = 0;
   private double sales5 = 0;
   //variable declaration total retail value
   private double totalRetailValue = 0;
   
   //default constructor
   public Sales (){}
   
   //method for entering products and sales total for each product
   public void enterProducts()
   {
      int productNumber = 999;
      int quantity = 999;
   
      while(productNumber != 0 && quantity != 0)
      {
         System.out.printf("Enter a product number (1-5) then a quantity, or zero's to exit:%n");
         
         productNumber = input.nextInt();
         quantity = input.nextInt();
      
         switch(productNumber)
         {
            case 0: break;
            case 1: qty1 += quantity; sales1 += price1 * qty1; totalRetailValue += sales1; break;
            case 2: qty2 += quantity; sales2 += price2 * qty2; totalRetailValue += sales2; break;
            case 3: qty3 += quantity; sales3 += price3 * qty3; totalRetailValue += sales3; break;
            case 4: qty4 += quantity; sales4 += price4 * qty4; totalRetailValue += sales4; break;
            case 5: qty5 += quantity; sales5 += price5 * qty5; totalRetailValue += sales5; break;
            default: System.out.printf("Invalid product.%n%n"); break;
         }
      }
      
   }//end of method
   
   //method for displaying total retail value
   public void displayTotalRetailValue()
   {
      System.out.printf("%nProduct  Quantity  Sales%n");
      System.out.println("------------------------");
      System.out.printf("$%.2f     %d        $%.2f%n", price1, qty1, sales1);
      System.out.printf("$%.2f     %d        $%.2f%n", price2, qty2, sales2);
      System.out.printf("$%.2f     %d        $%.2f%n", price3, qty3, sales3);
      System.out.printf("$%.2f     %d        $%.2f%n", price4, qty4, sales4);
      System.out.printf("$%.2f     %d        $%.2f%n", price5, qty5, sales5);
      System.out.printf("--------- Total:   $%.2f%n%n", totalRetailValue);
      
   }//end of method
   
   
}//end class