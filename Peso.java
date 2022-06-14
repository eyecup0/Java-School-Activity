import java.text.DecimalFormat;
import java.util.Scanner;

public class Peso {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

   public static void main(String[] args) {

           double usdtopeso= 51.25;

           double usd=0.00;

           

           try (Scanner reader = new Scanner(System.in)) {
            System.out.println("\n");
               System.out.print("\t\tUS Dollar to Peso");
               System.out.println("\n");

               System.out.print("\tExchange Rate PHP 51.25 to USD 1.00");
               System.out.println("\n");

               System.out.print("\tEnter the amount in US Dollar : ");

               usd = reader.nextDouble();
        }

           double amountinpeso = usd*usdtopeso;

           

           System.out.print("\n");
           System.out.println("\tThe value of Peso is PHP " +df2.format(amountinpeso));
           System.out.print("\n");
           System.out.println("\tEnd of Program");
           System.out.println("\n\n");

   }

}