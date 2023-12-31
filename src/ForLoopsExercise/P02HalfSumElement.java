package ForLoopsExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1;i <= number;i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
            if (currentNum > maxNumber){
                maxNumber = currentNum;
            }
        }
        int sumWithoutMaxNumber = sum - maxNumber;
        if (sumWithoutMaxNumber == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sumWithoutMaxNumber);
        }else{
            int diff = Math.abs(sumWithoutMaxNumber - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }
    }
}