public class prime{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        int n = 29;
        if(isPrime(n)){
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
    }
}