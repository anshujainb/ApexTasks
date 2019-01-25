public class StringConcat{
    public static void main(String[] args) {
        StringBuffer st1=new StringBuffer("");
        System.out.println("before appending");
        System.out.println(st1.capacity());
        System.out.println(st1.length());
        st1.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("after appending");

        System.out.println(st1.capacity());
        System.out.println(st1.length());

        System.out.println(st1);

        StringBuilder st2=new StringBuilder("");
        System.out.println("before appending");
        System.out.println(st2.capacity());
        System.out.println(st2.length());
        st2.append("abcdefghijklmnopqrstuvwxyz");

        System.out.println("after appending");
        System.out.println(st2.capacity());
        System.out.println(st2.length());
        System.out.println(st2);


    }
}