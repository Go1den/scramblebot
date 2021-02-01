import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScrambleStringUtilities {

    public static String scrambleWord(String word) {
        List<Character> chars = word.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        Collections.shuffle(chars);
        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean isAllSameLetter(String word) {
        return word.chars().allMatch(c -> c == word.charAt(0));
    }

    public static String getHyphenedString(String s) {
        List<Character> chars = s.chars().mapToObj(c -> c == ' ' ? ' ' : '-').collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String scrambleGameName(String gameName) {
        List<String> shuffledWords = new ArrayList<>();
        for (String s : gameName.split("\\s")) {
            if (isAllSameLetter(s)) {
                shuffledWords.add(s);
            } else {
                boolean isScrambled = false;
                while (!isScrambled) {
                    String scrambledWord = scrambleWord(s);
                    if (!scrambledWord.equals(s)) {
                        shuffledWords.add(scrambledWord);
                        isScrambled = true;
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (String s : shuffledWords) {
            result.append(s);
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
