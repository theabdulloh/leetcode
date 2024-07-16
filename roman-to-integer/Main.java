import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().romanToInt("III"));
    }
    
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            if((i + 1 == s.length()) || map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                ans += map.get(s.charAt(i));
            } else {
                ans += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                i++;
            }
        }

        return ans;
    }
}