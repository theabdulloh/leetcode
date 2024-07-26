import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        
        char counter = 'a';
        for(int i = 0; i < key.length(); i++) {
            if(key.charAt(i) != ' ' && !map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), counter++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') {
                sb.append(message.charAt(i));
            } else {
                sb.append(map.get(message.charAt(i)));
            }
        }

        return sb.toString();
    }
}
