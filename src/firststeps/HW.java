package firststeps;

import java.io.PrintStream;
import java.util.Scanner;
public class HW {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int Percent = Integer.parseInt(scanner.nextLine());
        double V = length * wide * height;
        double VLitres = V * 0.001;
        double Percent3 = Percent * 0.01;
        double Percent2 = VLitres * Percent3;
        double all = VLitres - Percent2;
        System.out.println(all);
        }
    }

