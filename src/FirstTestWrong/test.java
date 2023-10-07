package FirstTestWrong;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rollsPaper = Integer.parseInt(scanner.nextLine());
        int rollsCloth = Integer.parseInt(scanner.nextLine());
        double litresGlue = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double paper = 5.80;
        double cloth = 7.20;
        double glue = 1.20;
        double pricePaper = rollsPaper*paper;
        double priceCloth = rollsCloth * cloth;
        double priceGlue = litresGlue * glue;
        sum = priceGlue + priceCloth + pricePaper;
        double percent = 100 - percentDiscount;
        double cost = sum *percent/100;
        System.out.printf("%.3f",cost);


    }
}
