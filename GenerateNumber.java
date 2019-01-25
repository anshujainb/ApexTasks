public class GenerateNumber{
    public void generateUptoThousand(){
        for(int i=1;i<=1000;i++){
            System.out.println(i);
        }
    }

    public void generateOddNum(){
        for (int i=0;i<=1000;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    public void multipleOfFive(){
        for (int i=1;i<1000;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        GenerateNumber obj=new GenerateNumber();
        System.out.println("Odd Nums are:");
        obj.generateOddNum();

        System.out.println("Num upto 1000 are:");
        obj.generateUptoThousand();

        System.out.println("Nums Multiple of 5 and less than 1000 are:");
        obj.multipleOfFive();

        
        
    }
}