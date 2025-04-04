package StringJBK;

public class SplitingPRo {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        String[] words = sentence.split(" ");

        // Printing each word
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }

}
