public class logical {
public static void main(String[] args) {
    System.out.println((3>2)&& (5>0)); // prints true && true = true means uses and operator
    System.out.println((3>2)|| (5<0)); // prints true || false = true means uses or operator
    System.out.println(!(3>2)); // prints !true = false means uses not operator
}
}