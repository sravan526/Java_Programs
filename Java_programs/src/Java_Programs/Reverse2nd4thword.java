package Java_Programs;

public class Reverse2nd4thword {
    public static void main(String[] args) {
        String input = "Annam Sravan Kumar Automation";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Check if there are at least 4 words in the input
        if (words.length >= 4) {
            // Reverse the characters of the 2nd word
            words[1] = reverseString(words[1]);
            
            // Reverse the characters of the 4th word
            words[3] = reverseString(words[3]);
            
            // Rebuild the string
            String reversedString = String.join(" ", words);
            
            System.out.println("Reversed String: " + reversedString);
        } else {
            System.out.println("Input string does not contain enough words.");
        }
    }
    
    // Function to reverse a string
    private static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}