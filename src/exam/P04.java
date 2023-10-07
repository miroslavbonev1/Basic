package exam;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCats = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int largeCats = 0;
        int extraLarge = 0;
        double oneKilo = 12.45;
        double totalFoodNeeded = 0;
        double price = 0;
         for (int i = 1; i <= numberCats; i++) {
             double foodPerCat = Double.parseDouble(scanner.nextLine());
             totalFoodNeeded += foodPerCat;
             if (foodPerCat >= 100 && foodPerCat < 200){
                 smallCats++;
             } else if (foodPerCat>=200 && foodPerCat<300) {
                 largeCats++;
             } else if (foodPerCat>= 300 && foodPerCat < 400) {
                 extraLarge++;
             }
         }
         totalFoodNeeded = totalFoodNeeded / 1000;
         price = totalFoodNeeded * oneKilo;
        System.out.printf("Group 1: %d cats.%n",smallCats);
        System.out.printf("Group 2: %d cats.%n",largeCats);
        System.out.printf("Group 3: %d cats.%n",extraLarge);
        System.out.printf("Price for food per day: %.2f lv.%n",price);
    }
}
