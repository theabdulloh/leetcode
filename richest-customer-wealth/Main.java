class Main {
    public static void main(String[] args) {
        System.out.println(new Main().maximumWealth(new int[][] { {1, 2, 3}, {3, 2, 1} }));
    }
    
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
