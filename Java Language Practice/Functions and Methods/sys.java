import java.util.*;
public class sys{
    public static void printHelloworld(){
        System.out.println("Hello World");
        System.out.println("This is a function");
        System.out.println("This is a function call");
        return; //return statement
    }

    public static void calculatesum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is: "+sum);
    }

    public static void main(String[] args){
        printHelloworld(); //function call
        calculatesum();
    }
}