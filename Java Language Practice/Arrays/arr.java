import java.util.*;
public class arr{
    public static void main(String[] args){
        int marks[] =new int[5];
        int numbers[]={1,2,3,4,5};
        String names[] = {"John", "Jane", "Doe"};
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt(); //phy
        marks[1]=sc.nextInt(); //chem
        marks[2]=sc.nextInt(); //maths
        marks[3]=sc.nextInt(); //english
        marks[4]=sc.nextInt(); //computer

        System.out.println("Marks in Physics: "+marks[0]);
        System.out.println("Marks in Chemistry: "+marks[1]);
        System.out.println("Marks in Maths: "+marks[2]);
        System.out.println("Marks in English: "+marks[3]);
        System.out.println("Marks in Computer: "+marks[4]);


        marks[2]=100; //changing marks in maths
        System.out.println("Marks in Maths after changing: "+marks[2]);
    
    }
}