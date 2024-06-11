import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().countPairs(List.of(-1, 1, 2, 3, 1), 2));
    }
    
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.size() - 1; i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if((nums.get(i) + nums.get(j)) < target) {
                    count++;
                }
            }
        }
    
        return count;
    }
}
