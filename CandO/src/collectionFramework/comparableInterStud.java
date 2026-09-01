package collectionFramework;

import java.util.*;

public class comparableInterStud {
    static void main(String[] args) {
        int[] arr = {5,6,4,2,7};
        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a + " ");
        }










//        List<Integer> lst = new ArrayList<>();
//        lst.add(7);
//        lst.add(2);
//        lst.add(8);
//        lst.add(5);
//
//        System.out.println(lst);
//        Collections.sort(lst);
//        System.out.println(lst);

//        List<Stud> students = new ArrayList<>();
//        students.add(new Stud(19, "sid", 50));
//        students.add(new Stud(33, "bih", 45));
//        students.add(new Stud(28, "dih", 78));
//        students.add(new Stud(54, "dis", 63));
//        System.out.println(students);
//
//        Collections.sort(students,((o1, o2) -> o1.weight- o2.weight));//lambda exp  //new weightComparator());//new Comparator<Stud>() {
//            @Override
//            public int compare(Stud o1, Stud o2) {
//                return o1.weight - o2.weight;
//            }
//        });
//        System.out.println(students);
    }

}
