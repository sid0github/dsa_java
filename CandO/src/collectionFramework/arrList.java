package collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrList {
    //list or collocetions are just interfaces
    //arraylist is a concrete class
    static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        //add
//        list.add(20);
//        list.add(40);
//        list.add(60);
//        System.out.println(list);
//
//        list.remove(0);
//
//        System.out.println(list);
//        //List<Integer> arr = new ArrayList<>();
//        //Collection<Integer> arr = new ArrayList<>();
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//
//        //addall
//        list.addAll(list2);
//
//        System.out.println(list);
//
//        list.removeAll(list2);
//
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        System.out.println("print list2: " + list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        //list traversal
//        //next() -> prints all the traversed eles
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("ele: " + iterator.next());
//        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        System.out.println(list3.get(1));

        System.out.println("before set: "+ list3);
        list3.set(0,0); //overwrites the ele with new ele on the (index,ele)
        System.out.println("after: " + list3 );


        //to array
        Object[] arr = list3.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        //contains()

        System.out.println(list3.contains(2));




    }
}
