public class Reverse_Each_word_In_String {
    public static void main(String[] args) {
        String sentence = "Hello how are you Utkasrh";
        String reversed = reverseWords(sentence);
        System.out.println("Original: " + sentence);
        System.out.println("Reversed Words: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Iterate over each word
        for (String word : words) {
            // Reverse each word and append to the result string
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }

        // Trim the trailing space and return the result
        return reversedString.toString().trim();
    }
}
