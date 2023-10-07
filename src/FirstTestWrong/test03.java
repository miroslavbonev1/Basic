package FirstTestWrong;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double price1 = distance * 3;
        double price10 = distance * 5;
        double price40 = distance * 10;
        double price90 = distance * 15;
        double price150 = distance * 20;
        if (type.equals("standard")){
            if(weight < 1){
                price = price1;
            } else if (weight<10) {
                price = price10;
            }else if (weight<=40) {
                price = price40;
            }else if (weight<=90) {
                price = price90;
            }else if (weight<=150) {
                price = price150;
            }
        } else if (type.equals("express")) {
            if(weight < 1){
                double edno = 0.8 * price1 * weight;
                price = price1 + edno;
            } else if (weight<10) {
                double dve = 0.4 * price10 * weight;
                price = price10 + dve;
            }else if (weight<=40) {
                double tri = 0.05 * price40 * weight;
                price = price40 + tri;
            }else if (weight<=90) {
                double chetiri = 0.02 * price90 * weight;
                price = price90 + chetiri;
            }else if (weight<=150) {
                double pet = 0.01 * price150 * weight;
                price = price150 + pet;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg." +
                " would cost %.2f lv.",weight,price/100);
    }
}
