class Main {
    public static void main(String[] args) {
        System.out.println(new Main().differenceOfSum(new int[] {1, 15, 6, 3}));
    }
    
    public int differenceOfSum(int[] nums) {
        return Math.abs(sumArray(nums) - sumDigits(nums));
    }

    public int sumArray(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int sumDigits(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 9) {
                sum += nums[i];
            } else {
                while(nums[i] != 0) {
                    sum += nums[i] % 10;
                    nums[i] /= 10;
                }
            }
        }
        return sum;
    }
}
