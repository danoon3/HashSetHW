import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected boolean answer;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> wordChecker = new HashSet<>();
        String[] someWord = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < someWord.length; i++) {
            wordChecker.add(someWord[i]);
        }

        if (wordChecker.contains(word)) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}
