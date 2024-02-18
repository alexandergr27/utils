import java.util.HashMap;
import java.util.Map;

/**
 * 2024.
 *
 * @author Alexander Guzmán Rodríguez on 18/02/2024.
 * Package name: PACKAGE_NAME
 * @project utils.
 */
public class WordToNumber {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public Map<Character, Integer> convertToMap() {
        Map<Character, Integer> lettersToNumbers = new HashMap<>();
        int number = 1;
        for (char c : alphabet) {
            lettersToNumbers.put(c, number);
            number++;
        }
        return lettersToNumbers;
    }

    public int[] convertWordToNumbers(String word) {
        Map<Character, Integer> data = convertToMap();
        char[] letters = word.toCharArray();
        int[] numbers = new int[letters.length];
        int index = 0;
        for (char c : letters) {
            numbers[index] = data.get(c);
            index++;
        }
        return numbers;
    }
}
