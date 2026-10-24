public class passfail{
    public static void main(String[] args) {
        int marks = 75; // Example marks, you can change this value to test different scenarios

        // Using ternary operator to determine pass or fail
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}