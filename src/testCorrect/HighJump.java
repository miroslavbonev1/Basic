package testCorrect;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = Integer.parseInt(scanner.nextLine());
        int minimalGoal = goal - 30;
        int countJumpsFailed = 0;
        int currentJump = 0;
        int currentCount = 0;
        while( currentJump < goal){
            currentJump = Integer.parseInt(scanner.nextLine());
            currentCount ++;
            if (currentJump > minimalGoal){
                minimalGoal +=5;
                countJumpsFailed = 0;
                continue;
            }
            countJumpsFailed ++;
            if (countJumpsFailed >= 3){
                System.out.printf("Tihomir failed at %dcm after %d jumps.%n",minimalGoal,currentCount);
                break;
            }
        }
        if (currentJump > goal){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.%n",goal,currentCount);
        }
    }
}
