import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double temp = 0;
        String cont = "Y";
        Boolean contHasResponse = false;

        do {
            if (cont.equalsIgnoreCase("Y")) {
                System.out.println("Please input a temperature to change from Farenheit to Celsius.");
                if (scan.hasNextDouble()) {
                    temp = scan.nextDouble();
                    double tempConverted = ((temp - 32) * 5 / 9);
                    scan.nextLine();
                    System.out.print("The temperature " + temp + " converted to Farenheit equals: ");
                    System.out.printf("%.2f", tempConverted);
                    System.out.println(".");
                    System.out.println("Would you like to play again?");
                    do {
                        if (scan.hasNextLine()) {
                            cont = scan.nextLine();
                            if (cont.equalsIgnoreCase("Y") || cont.equalsIgnoreCase("N")) {
                                contHasResponse = true;
                            } else {
                                scan.nextLine();
                                System.out.println("You have inputted an invalid response - please try again.");
                            }
                        } else {
                            scan.nextLine();
                            System.out.println("You have inputted an invalid response - please try again.");
                        }
                    } while (contHasResponse == false);
                } else {
                    System.out.println("You have inputted an invalid response - please try again.");
                    scan.nextLine();
                }
            }
        } while (!cont.equalsIgnoreCase("N"));

        System.out.println("Thank you for playing!");
        System.exit(0);

    }
}
