class Main {
    public static void main(String[] args) {
        System.out.println(new Main().finalValueAfterOperations(new String[] { "--X","X++","X++" }));
    }
    
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String operation: operations) {
            if(operation.contains("-")) {
                ans--;
            } else {
                ans++;
            }
        }
        return ans;
    }
}
