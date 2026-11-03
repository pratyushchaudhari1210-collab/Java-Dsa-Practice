public class fact{
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    /*public static int factorial(int n) {
     int f=1;
     for (int i=1;i<=n;i++){
        f=f*i;
     }
     return f;
    }*/
    public static void main(String[] args) {
        int num = 14;
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}