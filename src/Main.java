import java.util.Scanner;
import java.text.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, I am your investment earnings calculator!");
        System.out.println("I can keep track of your investments earnings of your shares");
        System.out.println("***********************************************");
        Scanner keyscan = new Scanner(System.in);
        System.out.println("Can you please input the buying price per share:");
        double buyingPrice= keyscan.nextDouble();
        System.out.println("***********************************************");

        int day =1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");
        while(true)
        {
            System.out.println("Please enter the closing price for the day"
                    + day + " (any negative value to leave: ");

            closingPrice = keyscan.nextDouble();
            System.out.println("***********************************************");
            if (closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0)
            {
                System.out.println("After Day" + day + ", you earned £" + df.format(earnings) + " per share.");
                System.out.println("***********************************************");
            } else if (earnings < 0.0)
            {
                System.out.println("After Day" + day + ", you lost £" + df.format(-earnings) + " per share.");
                System.out.println("***********************************************");
            } else
            {
                System.out.println("After Day" + day + ", you haven't per share.");
                System.out.println("***********************************************");
            }
            day += 1;
        }

        keyscan.close();

    }
}