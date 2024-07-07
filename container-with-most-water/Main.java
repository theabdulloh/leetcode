class Main {
    public static void main(String[] args) {
        System.out.println(new Main().maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }
    
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;
        while(i < j) {
            int count = 0;
            if(height[i] < height[j]) {
                count = height[i] * (j - i);
                i++;
            } else {
                count = height[j] * (j - i);
                j--;
            }
            if(count > max) {
                max = count;
            }
        }

        return max;
    }
}
