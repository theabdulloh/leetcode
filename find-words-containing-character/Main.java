import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().findWordsContaining(new String[] {"leet", "code"}, 'e'));
    }
    
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == x) {
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }
}
