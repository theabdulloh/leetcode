class Main {
    public static void main(String[] args) {
    }
    
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            } else if(count != 0) {
                nums[i - count] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
