import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad= sc.nextFloat(); //nextFloat() method is used to read a float value from the user input
        float area = 3.14f * rad * rad; //area of circle
        System.out.println("Area of circle: " + area); //print the area of circle
    }
}