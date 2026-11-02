import java.util.Scanner;
public class nest{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //line is i
            for(int j=1;j<=i;j++){ //j is no. of stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}