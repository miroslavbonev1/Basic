package testCorrect;

import java.util.Scanner;

import static java.lang.Math.abs;

public class MultiplyTable06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        int first = input % 10;
        int second = (input / 10) % 10;
        int third = input / 100;


        for(int i = 1; i<= first; i++)
            for(int j = 1; j<= second; j++)
                for(int k = 1; k<= third; k++)
                    System.out.printf("%d * %d * %d = %d;\n", i, j, k, i*j*k);
    }
}