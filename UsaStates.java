import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsaStates{
    public static void main(String[] args) {
        ArrayList<String> states=new ArrayList<>();
        states.add("Ca");
        states.add("Tx");
        states.add("MN");
        states.add("Fl");
        states.add("wA");
        states.add("Ca");

        for(String str:states){
            System.out.println(str);
        }
        System.out.println("Hashset Elements are:");
        HashSet <String> statesSet=new HashSet<String>();
        statesSet.add("Ca");
        statesSet.add("Tx");
        statesSet.add("MN");
        statesSet.add("Fl");
        statesSet.add("WA");
        statesSet.add("Ca");

        for (String str:statesSet){
            System.out.println(str);
        }

        System.out.println("Treeset Elements are:");
        Set <String> statesSet2=new TreeSet<String>();
        statesSet2.add("Ca");
        statesSet2.add("Tx");
        statesSet2.add("MN");
        statesSet2.add("Fl");
        statesSet2.add("WA");
        statesSet2.add("Ca"); 
        
        for (String st:statesSet2){
            System.out.println(st);
        }
    }


    
    
}