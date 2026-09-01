package collectionFramework;
import java.util.*;

public class linkedHashSet {
    public int rollNo;
    public String name;

    @Override
    public String toString() {
        return "linkedHashSet{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public linkedHashSet(int rollNo, String name){
        this.rollNo=rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        linkedHashSet that = (linkedHashSet) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
