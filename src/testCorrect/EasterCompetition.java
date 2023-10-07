package testCorrect;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCake = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;
        for (int i = 1; i <= numberCake; i++) {
            String name = scanner.nextLine();
            String current = scanner.nextLine();
            int allMarks = 0;
            while (!current.equals("Stop")){
                int currentGrade = Integer.parseInt(current);
                allMarks +=currentGrade;
                current = scanner.nextLine();}
            System.out.printf("%s has %d points.%n",name,allMarks);
            if (allMarks > maxPoints){
                System.out.printf("%s is the new number 1!%n",name);
                winner = name;
                maxPoints = allMarks;
                }
        }
        System.out.printf("%s won competition with %d points!%n",winner,maxPoints);
    }
}
