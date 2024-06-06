class Main {
    public static void main(String[] args) {
        System.out.println(new Main().buildArray(new int[] { 0, 2, 1, 5, 3, 4 }));
    }
    
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
