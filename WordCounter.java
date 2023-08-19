import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        
        String[] words = inputText.split("[\\s\\p{Punct}]+");

        
        int wordCount = 0;

        
        for (String word : words) {
            if (!word.isEmpty()) { 
                wordCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}