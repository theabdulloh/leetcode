class Main {
    public static void main(String[] args) {
        System.out.println(new Main().removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }
    
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            if(nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
            } else {
                i++;
            }
        }

        return i;
    }
}