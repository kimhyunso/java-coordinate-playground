package matrix.validation;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {
    public static final String REGEX = "[,()-]";
    public static List<Integer> filterParseIntegers(String matrixPosition) {
        return Arrays.stream(matrixPosition.split(REGEX))
                .filter(Utils::isNotEmpty)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
    private static boolean isNotEmpty(String position) {
        return !position.isEmpty();
    }

    public static boolean containAlphabet(String word) {
        return word.matches(".*[a-zA-Z].*");
    }
}
