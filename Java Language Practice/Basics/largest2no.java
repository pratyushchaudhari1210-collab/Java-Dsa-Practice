import java.util.Scanner;
public class largest2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int largest;

        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }

        System.out.println("The largest number is: " + largest);
    }
}
