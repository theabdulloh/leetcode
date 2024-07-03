import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));
    }
    
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
