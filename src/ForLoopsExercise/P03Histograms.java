package ForLoopsExercise;

import java.util.Scanner;

public class P03Histograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1count = 0;
        int p2count = 0;
        int p3count = 0;
        int p4count = 0;
        int p5count = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum<200){
                p1count++;
            }else if (currentNum <= 399){
                p2count++;
            }else if(currentNum <= 599){
                p3count++;
            } else if (currentNum<= 799) {
                p4count++;
            }else {
                p5count++;
            }
        }
        double percentP1 = (p1count * 1.0 / n ) * 100;
        double percentP2 = (p2count * 1.0 / n ) * 100;
        double percentP3 = (p3count * 1.0 / n ) * 100;
        double percentP4 = (p4count * 1.0 / n ) * 100;
        double percentP5 = (p5count * 1.0 / n ) * 100;
        System.out.printf("%.2f%%%n",percentP1);
        System.out.printf("%.2f%%%n",percentP2);
        System.out.printf("%.2f%%%n",percentP3);
        System.out.printf("%.2f%%%n",percentP4);
        System.out.printf("%.2f%%%n",percentP5);
    }
}
