package collectionFramework;

import java.util.Comparator;

public class weightComparator implements Comparator<Stud> {


    @Override
    public int compare(Stud o1, Stud o2) {
        return Integer.compare(o1.weight, o2.weight);
        //return o1.weight-o2.weight;
    }
}
