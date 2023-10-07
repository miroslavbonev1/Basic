package ForLoopsExercise;

import java.util.Scanner;

public class P04SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceForToy = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double moneyEvenAge = 10;
        int countToys = 0;
        for (int currentAge = 1; currentAge <= age; currentAge++) {
            if (currentAge % 2 == 0) {
                sum+= moneyEvenAge;
                moneyEvenAge+=10;
                sum--;
            } else {
                countToys++;
            }
            sum += countToys * priceForToy;
            double diff = Math.abs(priceWashingMachine - sum);
            if (sum > priceWashingMachine) {

                System.out.printf("Yes! %.2f", diff);
            } else {

                System.out.printf("No! %.2f", diff);
            }
        }
    }
}
