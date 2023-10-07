package testCorrect;

import java.io.PrintStream;
import java.util.Scanner;

public class PinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= firstNumber; i++)
            if (i > 1 && i < 9) {
                for (int j = 2; j <= secondNumber; j++)
                    if (j >= 2 && j <= 7) {
                        boolean simpleNumber = j / j == 1 && j / 1 == j && j != 4 && j != 6;
                        for (int k = 2; k <= thirdNumber; k++)
                            if (k > 1 && k < 9) {
                                boolean firstThird = i % 2 == 0 && k % 2 == 0;
                                while (firstThird && simpleNumber) {
                                    if (secondNumber <= 7 && secondNumber >= 2) {
                                        System.out.printf("%d %d %d%n", i, j, k);
                                        break;
                                    }
                                }
                            }
                    }
            }
    }
}