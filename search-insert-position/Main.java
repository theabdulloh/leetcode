class Main {
    public static void main(String[] args) {
        System.out.println(new Main().searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }
    
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;

        while(left <= right) {
            mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}