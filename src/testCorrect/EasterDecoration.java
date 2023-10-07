package testCorrect;

import java.util.Scanner;

import static java.lang.System.out;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBought = 0;
        int countBasket = 0;
        int countWreath = 0;
        int countChocolateBunny = 0;
        double allMoneySpent = 0;
        int numberClients = Integer.parseInt(scanner.nextLine());
        String bought = "";
        double money = 0;
        for (int i = 1; i <= numberClients; i++) {
            bought = scanner.nextLine();
            money = 0;
            countWreath = 0;
            countBought = 0;
            countChocolateBunny = 0;
            countBasket = 0;
            while (!bought.equals("Finish")) {
                if (bought.equals("basket")) {
                    countBasket++;
                } else if (bought.equals("wreath")) {
                    countWreath++;
                }
                if (bought.equals("chocolate bunny")) {
                    countChocolateBunny++;
                }
                bought = scanner.nextLine();
            }
            money = (countBasket * 1.50) + (countWreath * 3.80) + (countChocolateBunny * 7);
            countBought = countBasket + countWreath + countChocolateBunny;
            if (countBought % 2 == 0) {
                money = money * 0.8;
            }
            out.printf("You purchased %d items for %.2f leva.%n", countBought, money);
            allMoneySpent += money;
        }
        System.out.printf("Average bill per client is: %.2f leva.%n", allMoneySpent / numberClients);
    }
}
