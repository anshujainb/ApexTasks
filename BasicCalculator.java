public class BasicCalculator{
    int num1;
    int num2;
    int res=0;

    public BasicCalculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int Add(){
        res=num1+num2;
        return res;
    }

    public int Multi(int x,int y){
        res=x*y;
        return res;
    }

    public int subs(int x,int y){
        res=x-y;
        return res;
    }

    public double div(int x,int y){
        return (double)x/y;
    }


}