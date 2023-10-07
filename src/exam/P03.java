package exam;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        boolean isCorrect = typeSouvenir.equals("flags") || typeSouvenir.equals("caps") ||
                typeSouvenir.equals("posters") || typeSouvenir.equals("stickers");
        boolean isCorrectTeam = team.equals("Argentina") || team.equals("Brazil") || team.equals("Croatia")
                || team.equals("Denmark");
        double price = 0;
        if (team.equals("Argentina")) {
            if (typeSouvenir.equals("flags")) {
                price = count * 3.25;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("caps")) {
                price = count * 7.20;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("posters")) {
                price = count * 5.10;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("stickers")) {
                price = count * 1.25;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (!typeSouvenir.equals(isCorrect)){
                System.out.println("Invalid stock!");
            }
        } else if (team.equals("Brazil")) {
            if (typeSouvenir.equals("flags")) {
                price = count * 4.20;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("caps")) {
                price = count * 8.50;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("posters")) {
                price = count * 5.35;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("stickers")) {
                price = count * 1.20;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            }
            else if (!typeSouvenir.equals(isCorrect)){
                System.out.println("Invalid stock!");
            }
        } else if (team.equals("Croatia")) {
            if (typeSouvenir.equals("flags")) {
                price = count * 2.75;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("caps")) {
                price = count * 6.90;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("posters")) {
                price = count * 4.95;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("stickers")) {
                price = count * 1.10;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            }
            else if (!typeSouvenir.equals(isCorrect)){
                System.out.println("Invalid stock!");
            }
        } else if (team.equals("Denmark")) {
            if (typeSouvenir.equals("flags")) {
                price = count * 3.10;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("caps")) {
                price = count * 6.50;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("posters")) {
                price = count * 4.80;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            } else if (typeSouvenir.equals("stickers")) {
                price = count * 0.90;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, typeSouvenir, team, price);
            }
            else if (!typeSouvenir.equals(isCorrect)){
                System.out.println("Invalid stock!");
            }
        }
        else if (!team.equals(isCorrectTeam)){
            System.out.println("Invalid country!");
        }
    }
}
