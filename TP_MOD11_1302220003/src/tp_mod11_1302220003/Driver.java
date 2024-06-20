package tp_mod11_1302220003;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int input;
       int exceptionCount = 0;
       boolean validInput = false;

       System.out.println("Small Integer Tester");

       while (!validInput) {
           System.out.print("Masukkan integer: ");
           if (scanner.hasNextInt()) {
               input = scanner.nextInt();
               try {
                   if (input < 0 || input > 9) {
                       throw new SmallIntegerException("");
                   }
                   System.out.println("nilai benar");
               } catch (SmallIntegerException e) {
                   if (input < 0) {
                       System.out.println("nilai lebih kecil dari 0");
                   } else {
                       System.out.println("nilai lebih besar dari 9");
                   }
                   exceptionCount++;
                   System.out.println("jumlah small int exception: " + exceptionCount);
               }
           } else {
               System.out.println("Input harus integer");
               validInput = true;
               scanner.next();
           }
       }
    }
}
