import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCodeWithName{
    public static void main(String[] args) {
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        
        hmap.put(95032, "ca");
        hmap.put(2300,"mn");
        hmap.put(7333,"wt");

        for (Map.Entry entry: hmap.entrySet() ){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        
    }

}