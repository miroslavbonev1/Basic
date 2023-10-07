package verification2;

import java.util.Scanner;

public class godzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceForOnePersonsCloths = Double.parseDouble(scanner.nextLine());
        double priceDecor = budget * 0.1;
        double priceForCloths = countExtras * priceForOnePersonsCloths;
        if (countExtras > 150) {
            priceForCloths = countExtras * priceForOnePersonsCloths;
        }
        double finalSum = priceDecor * priceForCloths;
        double difference = Math.abs(finalSum - budget);

        if (finalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard %.2f needs leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}


