package arrays.hard;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: This problem has 3 variations. They are stated below:
 * Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
 * Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
 * Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
 *
 * In Pascal’s triangle, each number is the sum of the two numbers directly above it.
 */

public class PascalsTriangle {
    public List<List<Integer>> generatePascalsTriangle(int numRows) {
        List<List<Integer>> pascalsTriange = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i)list.add(1);
                else{
                    list.add(pascalsTriange.get(i-1).get(j-1) + pascalsTriange.get(i-1).get(j));
                }
            }
            pascalsTriange.add(list);
        }
        return pascalsTriange;
    }
}
