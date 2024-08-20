package Collection;

import java.util.*;

public class Insertionorder {
    public static void main(String args[]){
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana","apple","orange"));
        LinkedHashSet<String> lhs= new LinkedHashSet<>();
        traverse(lhs,list);
    }
    private static void traverse(LinkedHashSet<String> lhs, List<String> list) {
        for(String a:list){
            lhs.add(a);
        }
        Iterator<String> it = lhs.iterator();
        System.out.println("Elements in LinkedHashSet : ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}