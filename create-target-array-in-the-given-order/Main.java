import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().createTargetArray(new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 }));
    }
    
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
