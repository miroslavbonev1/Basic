package FirstTestWrong;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double kilometresFirstDay = Double.parseDouble(scanner.nextLine());
        int goal = 1000;
        double kilometresRan = 0;
        kilometresRan = kilometresRan + kilometresFirstDay;
        double totalKilometres = 0;
        for (int i = 1;i <= days ;i++) {
            int percentageIncrease = Integer.parseInt(scanner.nextLine());
            double progress = kilometresRan * percentageIncrease / 100.0;
            kilometresRan += progress;
            totalKilometres += kilometresRan;
        }if (totalKilometres >= goal){
            System.out.printf("You've done a great job running %.0f more   kilometers!",
                    totalKilometres-goal);
        }else {

            double needed = Math.abs(goal - totalKilometres);
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(needed));
        }
    }
}
