import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().kthDistinct(new String[] { "d", "b", "c", "b", "c", "a" }, 2));
    }
    
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String elem: arr) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        for(String elem: arr) {
            if(map.get(elem) == 1) {
                k--;
            }

            if(k == 0) {
                return elem;
            }
        }

        return "";
    }
}
