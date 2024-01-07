package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Here There are 2 variations of problem.
 * Variation 1:
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Example:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * Variation 2:
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 *
 * Example:
 * Input: n = 3
 * Output: [[1,2,3],[8,9,4],[7,6,5]]
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n-1, up = 0, down = m-1, direction = 0;
        while(left<=right && up<=down){
            if(direction == 0){
                for(int i = left;i<=right;i++){
                    list.add(matrix[up][i]);
                }
                System.out.println(list);
                up++;
            }
            else if(direction == 1){
                for(int i = up;i<=down;i++){
                    list.add(matrix[i][right]);
                }
                System.out.println(list);
                right--;
            }
            else if(direction == 2){
                for(int i = right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                System.out.println(list);
                down--;
            }
            else{
                for(int i = down;i>=up;i--){
                    list.add(matrix[i][left]);
                }
                System.out.println(list);
                left++;
            }
            direction++;
            direction %= 4;
        }
        return list;
    }

    public int[][] generateMatrix(int n) {
        int left = 0, right = n-1,up = 0,down = n-1,direction = 0, x = 1;
        int[][] spiral = new int[n][n];

        while(left<=right && up<=down){
            if(direction == 0){
                for(int i = left;i<=right;i++){
                    spiral[up][i] = x++;
                }
                up++;
            }
            else if(direction == 1){
                for(int i = up;i<=down;i++){
                    spiral[i][right] = x++;
                }
                right--;
            }
            else if(direction == 2){
                for(int i = right;i>=left;i--){
                    spiral[down][i] = x++;
                }
                down--;
            }
            else{
                for(int i = down;i>=up;i--){
                    spiral[i][left] = x++;
                }
                left++;
            }
            direction++;
            direction %= 4;
        }

        return spiral;
    }
}
