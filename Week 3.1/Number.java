import java.util.Scanner;

public class Number {
   public Number() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);

      try {
         System.out.println("Enter number:");
         String input = sc.nextLine();
          int num=Integer.parseInt(input);
         System.out.println("Enter number:" + num);
      } catch (NumberFormatException e) {
         System.out.println("Invalid number format");
      }

   }
}
