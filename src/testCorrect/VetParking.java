package testCorrect;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        int countdays = 0;
        int hours = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= days; i++) {
            countdays ++;
            double sum = 0;
             for (int j = 1; j <= hours; j++) {
                 if (countdays % 2 == 0 && j % 2 == 1 ){
                     sum += 2.50;
                 }
                 else if(countdays % 2 ==1 && j % 2 == 0) {
                     sum += 1.25;
                 } else{
                     sum += 1.0;
                 }
             }
            totalSum += sum;
            System.out.printf("Day: %d - %.2f leva%n",countdays,sum);
        }
        System.out.printf("Total: %.2f leva%n",totalSum);
    }
}
