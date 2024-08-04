class Main {
    public static void main(String[] args) {
        System.out.println(new Main().largestLocal(new int[][] { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } }));
    }
    
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = max(grid, i, j);
            }
        }

        return result;
    }

    private int max(int[][] grid, int row, int col) {
        int result = 0;
        for(int i = row; i < row + 3; i++) {
            for(int j = col; j < col + 3; j++) {
                result = Math.max(grid[i][j], result);
            }
        }

        return result;
    }
}
