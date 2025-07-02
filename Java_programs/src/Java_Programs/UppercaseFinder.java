package Java_Programs;

public class UppercaseFinder {

    public static void main(String[] args) {
        String input = "Hello, World!";
        String uppercaseLetters = findUppercaseLetters(input);

        System.out.println("Uppercase letters in the string: " + uppercaseLetters);
    }

    public static String findUppercaseLetters(String str) {
        StringBuilder uppercase = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase.append(ch);
            }
        }

        return uppercase.toString();
    }
}
