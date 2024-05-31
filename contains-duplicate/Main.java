import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().containsDuplicate(new int[] {1, 2, 3, 1}));
    }
    
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums) {
            if(st.contains(num)) {
                return true;
            }
            st.add(num);
        }
        return false;
    }
}