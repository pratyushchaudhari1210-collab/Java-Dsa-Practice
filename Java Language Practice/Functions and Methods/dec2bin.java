public class dec2bin{
    public int dec2bin(int n){
        int binary = 0;
        int base = 1;
        while(n > 0){
            int last_digit = n % 2;
            binary += last_digit * base;
            n /= 2;
            base *= 10;
        }
        return binary;
    }
    public static void main(String[] args){
        dec2bin obj = new dec2bin();
        int decimal = 10;
        int binary = obj.dec2bin(decimal);
        System.out.println("Binary representation of " + decimal + " is: " + binary);
    }
}