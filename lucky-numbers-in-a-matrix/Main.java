import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().luckyNumbers(new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }
    
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++) {
            int minVal = matrix[i][0];
            int minIndex = 0;

            for(int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minIndex = j;
                }
            }

            boolean isLucky = true;
            for(int k = 0; k < matrix.length; k++) {
                if(matrix[k][minIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if(isLucky) {
                list.add(minVal);
            }
        }

        return list;
    }
}
