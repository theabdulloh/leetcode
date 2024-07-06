class Main {
    public static void main(String[] args) {
        System.out.println(new Main().sortedSquares(new int[] {-4, -1, 0, 3, 10}));
    }
    
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0, j = nums.length - 1, count = 0;
        while(i <= j) {
            if(Math.abs(nums[i]) < Math.abs(nums[j])) {
                result[count++] = nums[j] * nums[j];
                j--;
            } else {
                result[count++] = nums[i] * nums[i];
                i++;
            }
        }

        reverse(result);
        return result;
    }

    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}
