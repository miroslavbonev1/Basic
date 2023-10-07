package EasyToMedium;

import java.util.Scanner;

public class mobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String contract = scanner.nextLine();
        String internetAdd = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double cost = 0;
        if (time.equals("one")){
            if (contract.equals("Small")){
                if(internetAdd.equals("yes")) {
                    cost = months * (9.98+5.50);
                }
                else {
                    cost = months * 9.98;
                }
            }else if(contract.equals("Middle")){
                if(internetAdd.equals("yes")) {
                    cost = months * (18.99+4.35);
                }
                else {
                    cost = months * 18.99;
                }
            } else if (contract.equals("Large")) {
                if(internetAdd.equals("yes")) {
                    cost = months * (25.98+4.35);
                }
                else {
                    cost = months * 25.98;
                }
            }else if (contract.equals("ExtraLarge")){
                if(internetAdd.equals("yes")) {
                    cost = months * (35.99+3.85);
                }
                else {
                    cost = months * 35.99;
                }
            }
        }else if (time.equals("two")){
            if (contract.equals("Small")){
                if(internetAdd.equals("yes")) {
                    cost = months * (8.58+5.50);
                }
                else {
                    cost = months * 8.58;
                }
            }else if(contract.equals("Middle")){
                if(internetAdd.equals("yes")) {
                    cost = months * (17.09+4.35);
                }
                else {
                    cost = months * 17.09;
                }
            } else if (contract.equals("Large")) {
                if(internetAdd.equals("yes")) {
                    cost = months * (23.59+4.35);
                }
                else {
                    cost = months * 23.59;
                }
            }else if (contract.equals("ExtraLarge")){
                if(internetAdd.equals("yes")) {
                    cost = months * (31.79+3.85);
                }
                else {
                    cost = months * 31.79;
                }
            }if (time.equals("two")){
                cost = cost * 0.925;
            }
        }
        System.out.printf("%.2f lv.",cost);
    }
}
