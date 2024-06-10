import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
    }
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for(int i = 1; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++) {
            list.add((candies[i] + extraCandies) >= max);
        }

        return list;
    }
}
