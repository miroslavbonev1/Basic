package exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        int length = 384400;
        double distance = 2 * length;
        double time = Math.ceil(distance / speed);
        time += 3;
        double neededFuel = (fuel*distance) / 100;
        System.out.printf("%.0f%n",time);
        System.out.printf("%.0f%n",neededFuel);
    }
}
