public class primerang{
    public static void PrimeInRange(int start, int end){
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i=2;i<=number/i;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int start = 10;
        int end = 50;
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        PrimeInRange(start, end);
    }
}