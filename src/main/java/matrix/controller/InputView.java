package matrix.controller;

import matrix.validation.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    public List<Integer> inputMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        return Utils.filterParseIntegers(input.next());
    }

}
