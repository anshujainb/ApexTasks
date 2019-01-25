class ArrayElementsWithIndex{
    

    public void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("val: "+arr[i]+" index: "+i);

        }
    }

   public static void main(String[] args) {
       int[] arr= {23,45,211,11,34,55,7,5,33,99};
       new ArrayElementsWithIndex().printArray(arr);
   }
}