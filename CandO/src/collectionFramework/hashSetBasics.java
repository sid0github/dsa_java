package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class hashSetBasics {
    static void main() {
//        Set<Integer> st = new HashSet<>();
//        Set<Integer> st1 = new HashSet<>();
//
//        st.add(1);
//        st.add(2);
//        st.add(4);
//        System.out.println(st);
//
//        st1.add(3);
//        st1.add(2);
//        st1.add(4);
//        st1.add(5);
//        st1.add(6);
//        System.out.println(st1);
//
//        st.retainAll(st1);
//
//        System.out.println(st);
//
//        System.out.println(st1.containsAll(st));


        HashSet<linkedHashSet> set = new HashSet<>();

        linkedHashSet s1 = new linkedHashSet(1, "sid");
        linkedHashSet s2 = new linkedHashSet(1, "sid");
        linkedHashSet s3 = new linkedHashSet(1, "sid");
 
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);


    }


}
