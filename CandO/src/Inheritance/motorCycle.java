package Inheritance;

public class motorCycle extends Vehicle{
    public String barStyle;
    public String susType;

    motorCycle(String name, String model, int noOfTyres, String barStyle, String susType){
        super(name, model, noOfTyres);
        this.barStyle = barStyle;
        this.susType = susType;
    }

    public void wheelie(){
        System.out.println("motorcyle do wheelie!! "+ name);
    }
}
