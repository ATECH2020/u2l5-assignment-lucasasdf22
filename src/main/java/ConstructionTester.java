import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {   
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sales tax rate");
        double taxRate = in.nextDouble();

        double lumberCost = 8.0;
        double windowCost = 11.0;

        Construction construct = new Construction(lumberCost, windowCost, taxRate);

        System.out.println("How many boards do you need?");
        int numBoards = in.nextInt();

        System.out.println("How many windows do you need?");
        int numWindows = in.nextInt();

        double total;
        total = construct.lumberCost(numBoards) + construct.windowCost(numWindows);

        double grandTotal;

        grandTotal = construct.grandTotal(total);

        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + grandTotal);
    }
}
