package collectionFramework;

public class Stud implements Comparable<Stud> {
    public int age;
    public String name;
    public int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Stud(int age, String name, int weight) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Stud that) {
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;//this method is called for current obj
    }

}
