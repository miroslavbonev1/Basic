package FirstTestWrong;

import java.util.Scanner;

public class teste02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceShirt = Double.parseDouble(scanner.nextLine());
        double sumNeeded = Double.parseDouble(scanner.nextLine());
        double priceShorts = priceShirt * 0.75;
        double priceSocks = priceShorts * 0.20;
        double priceShoes = (priceShirt + priceShorts) * 2;
        double sum = (priceShoes + priceShirt + priceShorts + priceSocks) * 0.85;
        double needed = Math.abs(sumNeeded - sum);
        if (sum >= sumNeeded){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",sum);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",needed);
        }
    }
}
