package Java_Programs;

public class LargestNumberWithoutIf {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;

        int largest = num1 ^ ((num1 ^ num2) & -(num1 < num2 ? 1 : 0));

        System.out.println("The largest number is: " + largest);
    }
}