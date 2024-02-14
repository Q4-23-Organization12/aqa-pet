package hw12collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitanicMap {
    public static void main(String[] args) {
        List<String> words = List.of("Their", "voyage", "on", "board", "the", "dream", "ship", "ended", "in",
                "a", "nightmare.", "It", "revealed", "all", "human", "vices:", "arrogance,", "self", "satisfaction,",
                "greed,", "selfishness", "and", "self-confidence.", "But", "at", "the", "same", "time", "this",
                "tragedy", "showed", "the", "best", "traits", "of", "human", "character:", "the", "sense", "of", "duty");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            int frequency = wordFrequencyMap.getOrDefault(lowercaseWord, 0);

            wordFrequencyMap.put(lowercaseWord, frequency + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}