public class product{
    public static int multiply(int a,int b) {
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        int result=multiply(a,b);
        System.out.println("The product of "+a+" and "+b+" is: "+result);
        result=multiply(7,3);
        System.out.println("The product of 7 and 3 is: "+result);
    }
}