package verification1;

import java.util.Scanner;

    public class secretpassword{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String random = scanner.nextLine();
            if (random.equals("s3cr3t!P@ssw0rd")) {
                System.out.println("Welcome");
            }else {
                System.out.println("Wrong Password!");
            }
        }
}
