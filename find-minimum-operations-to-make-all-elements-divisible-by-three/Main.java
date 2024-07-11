class Main {
    public static void main(String[] args) {
        System.out.println(new Main().minimumOperations(new int[] { 1, 2, 3, 4 }));
    }
    
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for(int i = 0; i < nums.length; i++) {
            if((nums[i] + 1) % 3 == 0 || (nums[i] - 1) % 3 == 0) {
                operations++;
            }
        }

        return operations;
    }
}
