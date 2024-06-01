package matrix.controller;

import matrix.domain.GameMode;
import matrix.domain.Point;
import matrix.validation.Utils;

import java.util.List;
import java.util.Scanner;

public class InputView {

    public static final int MAX_NO = 24;
    private String matrix[][] = new String[MAX_NO][MAX_NO];

    public List<Integer> inputMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        String line = input.next();

        return Utils.filterParseIntegers(line);
    }

    public void printMatrix(Point pointA, Point pointB){
        matrix = pointA.getMatrix(pointB);

        for (int i = matrix.length-1; i >= 0; i--){
            if (isEven(i) && !(i == 0)){
                System.out.printf("%02d|", i);
            }
            if (!isEven(i)){
                System.out.print("  |");
            }
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        printFooter();
        System.out.println();
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    private void printFooter() {
        for (int i = 0; i < MAX_NO; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 0; i < MAX_NO; i++) {
            if (isEven(i)){
                System.out.printf(" %2d ", i);
            }
        }
    }
}
