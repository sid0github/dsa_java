package Abstraction;

interface Bird{
    void fly();
    void eat();
}

//abstract class Bird{    //template
//    abstract void fly();
//    abstract void eat();
//}

class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("sparrow eating");
    }
}



public class Main {
    static void main(String[] args)  {
//        Bird b = new Sparrow(); //interface
//        b.eat();
//        b.fly();
        birdDoStuff(new Sparrow());
    }

    public static void birdDoStuff(Bird b){
        b.eat();
        b.fly();
    }

}
