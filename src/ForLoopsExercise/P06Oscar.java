package ForLoopsExercise;

import java.util.Scanner;

public class P06Oscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countExaminers = Integer.parseInt(scanner.nextLine());
        double sumAllPoints = academyPoints;
        for (int n = 1; n <= countExaminers; n++){
            String examinerName = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());
            sumAllPoints += (examinerName.length() * currentPoints) / 2;
            if(sumAllPoints >=1250.5){
                System.out.printf("Congratulations, %.s got a nominee for leading role with %.1f!",actorName, sumAllPoints);
                break;
            }
        }
        if(sumAllPoints<1250.5){
        System.out.printf("Sorry, %.s you need %.1f more!",actorName,Math.abs(1250.5 - sumAllPoints));
    }
}
}
