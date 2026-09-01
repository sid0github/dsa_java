package Encapsulation;

public class encap{
    public int id;
    public int age;
    private String name;
    public int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public encap(){

        System.out.println("constructor is called for class student");
    }

    public encap(int id, int age, String name, int nos, String gf){

        System.out.println("parameterized constructor is called for class student");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }

    public encap(Student source){ // copy constructor source-> A

        System.out.println("copy constructor is called for class student");
        this.id = source.id;
        this.name = source.name;
        this.age = source.age;
        this.nos = source.nos;
    }

    public void study(){

        System.out.println(name +" is studying ");
    }
    public void bunk(){

        System.out.println(name +" is bunking ");
    }
    public void eat(){

        System.out.println(name +" is eating ");
    }
    public void sleep(){

        System.out.println(name +" is sleeping");
    }

    private void chat(){
        System.out.println(gf + " gf chatting");
    }

    static void main() {
//        Encapsulation.Student A = new Encapsulation.Student(); // default constructor
//        A.id = 1;
//        A.age = 15;
//        A.name = "sid";
//        A.nos = 4;

        encap A = new encap(1, 15, "Sid", 5, "tina"); // parameterized constructor
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        A.bunk();
        A.study();
        A.eat();
        A.sleep();
        A.chat();

//        Encapsulation.Student B = new Encapsulation.Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.bunk();
//        B.study();
//        B.eat();
//        B.sleep();


    }

}

