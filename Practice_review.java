import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Practice_review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice_review
{
    Integer age = 17;
    ArrayList<String>words = new ArrayList<>();
    private int year;
    public final double PRICE = 10.00;
    public String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    private HashMap<String, Integer> groupSizes;
    public HashMap<String, Integer> getGroupSizes(){
        return groupSizes;
    }
    public boolean canRide(int age){
        if(age>10){
            System.out.println("You can ride the rollercoaster!!!");
            return true;
        }else{
            System.out.println("You cannot ride the rollercoaster. Maybe Next time");
            return false;
        }
    }
    public double calculatePay(double hours, double wage){
        double totalPay = hours * wage;
        double netPay  = totalPay * 0.70;
        return netPay;
    }
    public double paySalary(String fullName, double hour, double wage){
        double netPay = calculatePay(hour, wage);
        System.out.println(fullName + " was sent " + netPay + "CAD");
        return netPay;
    }
}