import java.util.Scanner;

public class NumberType{

    public boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;

        }
        catch(Exception e){
            return false;
        }
        
    }

    public boolean isOdd(String str){
        boolean flag=false;
        if(this.isInteger(str)){
            int num=Integer.parseInt(str);
            if(num%2!=0){
                flag=true;
            }
            else{
                flag=false;
            }
            return flag;
        }
        else{
            System.out.println("enter valid number");
            return false;
        }
        
    }

    public boolean isEven(String str){
        if(this.isInteger(str)){
            if(this.isOdd(str)){
                return false;
            }
            else{
                return true;
            }

        }
        else{
            System.out.println("enter valid input");
            return false;
        }
       


    }
    public boolean isPrime(String str){
        boolean flag=false;
        if(this.isInteger(str)){
            int num=Integer.parseInt(str);
            for (int i=2;i<=num/2;i++){
                if(num%i==0){
                    flag= false;
                    break;

                }
                else{
                    flag=true;
                }
            }
            return flag;
        }
        else{
            System.out.println("enter valid num");
            return flag;
        }


    }
    public static void main(String[] args) {
        System.out.println("enter input");
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        NumberType obj=new NumberType();
        System.out.println(obj.isInteger(input));
        System.out.println(obj.isEven(input));
        System.out.println(obj.isOdd(input));
        System.out.println(obj.isPrime(input));

        


    }
}