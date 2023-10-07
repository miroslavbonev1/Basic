package exam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double priceSweaters = 0;
        double priceToys = 0;
        int young = 0;
        int adults = 0;
        while(!input.equals("Christmas")){
            int age = Integer.parseInt(input);
            if (age<= 16){
                young++;
            } else if (age>16) {
                adults++;
            }
            input = scanner.nextLine();
        }
        priceToys = young * 5;
        priceSweaters = adults * 15;
        System.out.printf("Number of adults: %d%n",adults);
        System.out.printf("Number of kids: %d%n",young);
        System.out.printf("Money for toys: %.0f%n",priceToys);
        System.out.printf("Money for sweaters: %.0f%n",priceSweaters);
    }
}
