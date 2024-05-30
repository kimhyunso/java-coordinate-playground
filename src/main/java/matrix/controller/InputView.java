package matrix.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public static final String REGEX = "[,()-]";
    public List<Integer> filterParseIntegers(String matrixPosition) {
        return Arrays.stream(matrixPosition.split(REGEX))
                .filter(this::isNotEmpty)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
    private boolean isNotEmpty(String position) {
        return !position.isEmpty();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
