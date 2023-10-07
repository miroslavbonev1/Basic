package testCorrect;

import java.util.Scanner;

public class CardGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFirstPlayer = scanner.nextLine();
        String nameSecondPlayer = scanner.nextLine();
        String current = "";
        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        int sum = 0;
        String firstCardDraw = "";
        firstCardDraw = scanner.nextLine();
        while(!firstCardDraw.equals("End of game")){
            int firstCard = Integer.parseInt(firstCardDraw);
            int secondCard = Integer.parseInt(scanner.nextLine());
            if (firstCard > secondCard) {
                sum = firstCard - secondCard;
                firstPlayerPoints += sum;
            }else if (firstCard < secondCard) {
                sum = secondCard - firstCard;
                secondPlayerPoints += sum;
            }else if (firstCard == secondCard) {
                firstCard = Integer.parseInt(scanner.nextLine());
                secondCard = Integer.parseInt(scanner.nextLine());
                if (firstCard>secondCard) {
                    System.out.println("Number wars!");
                    System.out.printf("%S is winner with %d points%n",nameFirstPlayer,firstCard - secondCard);
                }if (firstCard<secondCard) {
                    System.out.println("Number wars!");
                    System.out.printf("%S is winner with %d points%n",nameSecondPlayer,secondCard - firstCard);
                }

            }
            firstCardDraw = scanner.nextLine();
        }
        System.out.printf("%s has %d points%n",nameFirstPlayer,firstPlayerPoints);
        System.out.printf("%s has %d points%n",nameSecondPlayer,secondPlayerPoints);
    }
}
