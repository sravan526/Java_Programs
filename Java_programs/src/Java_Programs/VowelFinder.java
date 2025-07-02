package Java_Programs;

public class VowelFinder {

    public static void main(String[] args) {
        String input = "Hello, World!";
        int vowelCount = countVowels(input);

        System.out.println("The number of vowels in the string is: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}