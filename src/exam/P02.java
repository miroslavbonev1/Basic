package exam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double mediumHeightPerson = Double.parseDouble(scanner.nextLine());
        double sizeRocket = width * length * height;
        double room = (mediumHeightPerson + 0.40) * 2 * 2;
        double spaceForPeople = Math.floor(sizeRocket / room);
        if (spaceForPeople>=3 && spaceForPeople<= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.",spaceForPeople);
        } else if (spaceForPeople<3) {
            System.out.println("The spacecraft is too small.");
        } else if (spaceForPeople>=10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
