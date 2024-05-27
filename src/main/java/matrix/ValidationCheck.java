package matrix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidationCheck {

    public static final String REGEX = "[,()-]";

    public List<String> removeSymbols(String matrixPosition) {
        return Arrays.stream(matrixPosition.split(REGEX))
                .filter(this::isNotEmpty)
                .collect(Collectors.toList());
    }

    private boolean isNotEmpty(String position) {
        return !position.isEmpty();
    }
}
