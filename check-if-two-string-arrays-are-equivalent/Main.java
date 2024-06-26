import java.util.Objects;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
    }
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String word: word1) {
            sb1.append(word);
        }
        for(String word: word2) {
            sb2.append(word);
        }

        return Objects.equals(sb1.toString(), sb2.toString());
    }
}
