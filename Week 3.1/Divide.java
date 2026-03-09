import java.util.Scanner;
public class Divide {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    try{
        System.out.println("Enter a  first number:");
        Integer num1=sc.nextInt();
        System.out.println("Enter a Second number:");
        Integer num2=sc.nextInt();
        Integer res=num1/num2;
        System.out.println(res);

    }catch(ArithmeticException  e){
        System.out.println("Division by zero not allowed");

    }
    }
    
}
