class Main {
    public static void main(String[] args) {
        System.out.println(new Main().leftRightDifference(new int[] { 10, 4, 8, 3 }));
    }
    
    public int[] leftRightDifference(int[] nums) {
        int[] array = new int[nums.length];
        int left = 0, right = sum(nums);
        for(int i = 0; i < nums.length; i++) {
            right -= nums[i];

            array[i] = Math.abs(left - right);

            left += nums[i];
        }

        return array;
    }

    private int sum(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans += nums[i];
        }

        return ans;
    }
}
