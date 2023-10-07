import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int first = number / 1000;
        int second = (number/ 100) % 10;
        int third = (number / 10 ) % 10;
        int fourth = number % 10;
         for (int i = 1; i <= first; i++) {
              for (int j = 1; j <= second; j++) {
                   for (int k = 1; k <= third; k++) {
                        for (int m = 1; m <= fourth; m++) {
                            System.out.printf("%d * %d * %d * %d = %d%n",i,j,k,m, i * j * k * m);
                        }
                   }
              }
         }
    }
}
