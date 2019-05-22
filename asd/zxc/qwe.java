public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;

        System.out.println("Reversed Number: " + reversed);//df
    }
}
