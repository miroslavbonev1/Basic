package FirstTestWrong;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int firstDigit = number % 10;
        int secondDigit = number / 10;
        int thirdDigit = number / 100;

    }
}
