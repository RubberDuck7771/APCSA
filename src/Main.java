import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dcf = new DecimalFormat("###.##");
        //ask for total bill
        Scanner one = new Scanner (System.in);
        System.out.print("ENTER Total Bill Price: $");
        String answer = one.nextLine();
        double totalBill = Double.parseDouble(answer);
        //ask for tip percentage
        Scanner two = new Scanner (System.in);
        System.out.print("ENTER Tip Percentage: ");
        String answer2 = two.nextLine();
        double tipPercentage = Double.parseDouble(answer2);
        //ask for number of people
        Scanner three = new Scanner (System.in);
        System.out.print("ENTER Number Of People: ");
        String answer3 = three.nextLine();
        int numPeople = Integer.parseInt(answer3);

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();

        //calculate total tip
        tipPercentage /= 100;
        double totalTip = totalBill * tipPercentage;
        System.out.println("Total Tip: $" + dcf.format(totalTip));

        //calculate total bill + tip
        totalBill += totalTip;
        System.out.println("Total Bill, with Tip: $" + dcf.format(totalBill));

        //calculate tip per person
        double splitTip = totalTip / numPeople;
        System.out.println("Tip per Person: $" + dcf.format(splitTip));

        //calculate total bill + tip per person
        double splitBill = totalBill / numPeople;
        System.out.println("Total Bill, with Tip, per Person: $" + dcf.format(splitBill));

        System.out.println();
        System.out.print("---------------------------------------------");
    }
}


