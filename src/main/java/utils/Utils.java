package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static final String REGEX = "[(|,|)|-]";

    public static List<Integer> split(String input) {
        return Arrays.stream(input.split(REGEX))
                .filter(Utils::isNotEmpty)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
    private static boolean isNotEmpty(String input){
        return !input.isEmpty();
    }
}
