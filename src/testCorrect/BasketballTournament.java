package testCorrect;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentName = scanner.nextLine();
        int win = 0;
        int lost = 0;
        int numberGames = 0;
        while(!tournamentName.equals("End of tournaments")){
            numberGames = Integer.parseInt(scanner.nextLine());
             for (int i = 1; i <= numberGames; i++) {
                 int pointsOurTeam = Integer.parseInt(scanner.nextLine());
                 int pointsEnemyTeam = Integer.parseInt(scanner.nextLine());
                 if (pointsOurTeam > pointsEnemyTeam){
                     win ++;
                     System.out.printf("Game %d of tournament %s: win with %d points.%n"
                             ,i,tournamentName,Math.abs(pointsOurTeam-pointsEnemyTeam));
                 }else{
                     lost ++;
                     System.out.printf("Game %d of tournament %s: lost with %d points.%n"
                             ,i,tournamentName,Math.abs(pointsEnemyTeam-pointsOurTeam));
                 }
             }
            tournamentName = scanner.nextLine();
        }
        int allGames = win + lost;
        System.out.printf("%.2f%% matches win%n",win * 1.0 / allGames* 100.0);
        System.out.printf("%.2f%% matches lost%n",lost * 1.0 / allGames * 100.0);
    }
}
