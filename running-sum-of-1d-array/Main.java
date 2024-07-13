class Main {
    public static void main(String[] args) {
        System.out.println(new Main().runningSum(new int[] { 1, 2, 3, 4 }));
    }
    
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
