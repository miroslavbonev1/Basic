
import org.ietf.jgss.GSSName;

import javax.swing.*;
import java.io.PrintStream;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCake = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;
        for (int i = 1; i <= numberCake; i++) {
            String nameChef = scanner.nextLine();
            String points = scanner.nextLine();
            int totalPoints = 0;
            while (!points.equals("Stop")) {
                int currentGrade = Integer.parseInt(points);
                totalPoints += currentGrade;
                points = scanner.nextLine();}
            System.out.printf("%s has %d points.", nameChef, totalPoints);
            if (totalPoints > maxPoints) {
                System.out.printf("%s is the new number 1!", nameChef);
                maxPoints = totalPoints;
                winner = nameChef;
                }
            }
        System.out.printf("%s won competition with %d points!", winner, maxPoints);
    }
}

