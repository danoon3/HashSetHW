import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected boolean answer;
    private static final Set<String> wordCheckers = new HashSet<>();

    public WordsChecker(String text) {
        String[] arrayWords = text.split("(?U)\\W");
        Collections.addAll(wordCheckers, arrayWords);
    }

    public boolean hasWord(String word) {
        answer = wordCheckers.contains(word);
        System.out.println(answer);
        return answer;
    }
}
