package verification2;

import java.util.Scanner;

public class P07Shoping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Видеокарта – 250 лв./бр.
        //Процесор – 35% от цената на закупените видеокарти/бр.
        //Рам памет – 10% от цената на закупените видеокарти/бр.
        double budget = Double.parseDouble(scanner.nextLine());
        int numberVideoCards = Integer.parseInt(scanner.nextLine());
        int numberProcessors = Integer.parseInt(scanner.nextLine());
        int numberVideoRam = Integer.parseInt(scanner.nextLine());
        int priceVideoCard = 250 * numberVideoCards;
        double priceProcessors = priceVideoCard * 0.35 * numberProcessors;
        double priceRam = priceVideoCard * 0.1 * numberVideoRam;
        double totalPrice = priceRam + priceProcessors + priceVideoCard;
        if (numberVideoCards >= numberProcessors) {
            totalPrice = totalPrice * 0.85;
            if (budget >= totalPrice) {
                double leftMoney = budget - totalPrice;
                System.out.printf("You have %.2f leva left!", leftMoney);
            } else if (budget < totalPrice) {
                double neededMoney = totalPrice - budget;
                System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
            }
        } else {
                if (budget >= totalPrice) {
                    double leftMoney = budget - totalPrice;
                    System.out.printf("You have %.2f leva left!", leftMoney);
                } else if (budget < totalPrice) {
                    double neededMoney = totalPrice - budget;
                    System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
                }
            }
        }
    }

