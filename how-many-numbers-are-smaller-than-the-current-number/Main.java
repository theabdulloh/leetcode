class Main {
    public static void main(String[] args) {
        System.out.println(new Main().smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 }));
    }
    
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++; 
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
