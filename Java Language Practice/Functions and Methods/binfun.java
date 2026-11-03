public class binfun{
    public static int bin2dec(int n){
        int decimal = 0;
        int power = 0;
        while(n>0){
            int lastdigit = n%10;
            decimal += lastdigit * Math.pow(2,power);
            power++;
            n/=10;
        }
        return decimal;
    }
    public static void main(String[] args){
        int n = 101;
        System.out.println(bin2dec(n));
    }
}