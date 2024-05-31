package matrix.controller;

import matrix.domain.Point;
import matrix.validation.Utils;

import java.util.List;
import java.util.Scanner;

public class InputView {

    public static final int MAX_NO = 25;
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
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
