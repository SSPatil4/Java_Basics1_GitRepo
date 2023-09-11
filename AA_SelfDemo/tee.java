package AA_SelfDemo;
import java.util.*;
public class tee {
}




class WordStats {
    int charCount;
    int intSum;

    public WordStats(int charCount, int intSum) {
        this.charCount = charCount;
        this.intSum = intSum;
    }
}

 class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("  ");

        Map<String, WordStats> wordStatsMap = new HashMap<>();

        for (String word : words) {
            int charCount = 0;
            int intSum = 0;

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount++;
                } else if (Character.isDigit(c)) {
                    int num = Character.getNumericValue(c);
                    intSum += num;
                }
            }

            wordStatsMap.put(word, new WordStats(charCount, intSum));
        }

        System.out.println("Word Statistics (Characters and Integer Sum):");
        for (Map.Entry<String, WordStats> entry : wordStatsMap.entrySet()) {
            String word = entry.getKey();
            WordStats stats = entry.getValue();
            System.out.println("'" + word + "': Characters = " + word.replaceAll("[^a-zA-Z]", "") + ", Integer Sum = " + stats.intSum);
        }
    }
}
