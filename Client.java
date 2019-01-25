import java.util.Scanner;

public class Client{

    
   public static void main(String[] args) {
    System.out.println("enter num1");
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();

    System.out.println("enter num2");
    int num2=sc.nextInt();

    BasicCalculator cal=new BasicCalculator(num1,num2);

    System.out.println("Addition:  "+cal.Add());
    System.out.println("Multiplication:  "+cal.Multi(num1,num2));
    System.out.println("Substraction :  "+cal.subs(num1,num2));
    System.out.println("Division:  "+cal.div(num1,num2));
    
   }
    
}