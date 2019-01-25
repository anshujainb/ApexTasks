import java.util.ArrayList;
import java.util.Scanner;

public class Fib{

    //using while loop

    public ArrayList<Integer> getFibSeries(int input){
        ArrayList <Integer> res= new ArrayList <Integer> ();
        int i=1;
        while(i<=input){
            res.add(i);
            if(i==1){
                res.add(i);
                i+=res.get(0);
            }
            else{
                i+=res.get(res.size()-2);
            }
        }
        return res;
    }



     public static void main(String[] args) {
         System.out.println("Enter range for fibonacci series");
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         System.out.println(getFibonacci(x));
         //System.out.println(new Fib().getFibSeries(x));
        
    }

    


}