package Inheritance;

public class Car extends Vehicle{
    public int noOfDoors;
    public String transType;

    Car(String name, String model,int noOfTyres, int noOfDoors, String transType){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transType = transType;
    }

    public void startAc(){
        System.out.println("AC of car started "+ name);
    }
}
