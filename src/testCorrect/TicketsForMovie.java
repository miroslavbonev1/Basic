package testCorrect;

import java.util.Scanner;

public class TicketsForMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfMovie = scanner.nextLine();
        int bestMovie = Integer.MIN_VALUE;
        String nameOfWinner = "";
        int tries = 0;
            while (!nameOfMovie.equals("STOP")){
                int sum = 0;
                tries ++;
                if (tries >= 7){
                    System.out.printf("The limit is reached.%n");
                    break;
                }
                int length = nameOfMovie.length();
                for (int i = 0; i <= length - 1; i++) {
                    char current = nameOfMovie.charAt(i);
                    int currentSum = current;
                    sum += current;
                    if (currentSum >= 97){
                        sum = sum - 2 * length;
                    }if(currentSum >= 65 && currentSum <= 90){
                        sum = sum - length;
                    }
                }
                if (sum >= bestMovie){
                    bestMovie = sum;
                    nameOfWinner = nameOfMovie;
                }
                nameOfMovie = scanner.nextLine();
            }
        System.out.printf("The best movie for you is %s with %d ASCII sum.%n",nameOfWinner,bestMovie);
    }
}
