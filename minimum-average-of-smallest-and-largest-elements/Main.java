import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().minimumAverage(new int[] { 7, 8, 3, 4, 15, 13, 4, 1 }));
    }
    
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        double min = Double.MAX_VALUE;
        for(int i = 0; i < n / 2; i++) {
            min = Math.min((double) (nums[i] + nums[n - 1 - i]) / 2, min);
        }
        
        return min;
    }
}
