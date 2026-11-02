import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=2;
        while(i<n){
            if(n%i==0){
                System.out.println("Not a prime number");
                break;
            }
            i++;
        }
        if(i==n){
            System.out.println("The number is a prime number");
        }
    }
}