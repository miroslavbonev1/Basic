package testCorrect;

import java.util.Scanner;

public class AsciiTableSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int length = word.length();
        int sum = 0;
         for (int i = 0; i <= length - 1; i++) {
             char current = word.charAt(i);
             int currentSum = current;
             sum += currentSum;
         }
        System.out.printf("%d",sum);

    }
}
