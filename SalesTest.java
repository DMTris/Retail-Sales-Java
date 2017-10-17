import java.util.Scanner;

public class SalesTest
{
   public static void main (String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      char choice = ' ';
   
      Sales sales = new Sales();
      
      do
      {
         System.out.printf("%n--Retail Sales Main Menu--%n");
         System.out.println("1. Enter products sold.");
         System.out.println("2. Display total retail value.");
         System.out.println("3. Exit.");
         System.out.print("Selection: ");
         
         choice = input.next().charAt(0);
         
         switch(choice)
         {
            case '1': sales.enterProducts(); break;
            case '2': sales.displayTotalRetailValue(); break;
            case '3': break;
            default: System.out.println("\nInvalid selection.\n1");
         }
         
      }while (choice != '3');
   }//end of main
}//end of class