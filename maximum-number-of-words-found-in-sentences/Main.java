class Main {
    public static void main(String[] args) {
        System.out.println(new Main().mostWordsFound(new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
    }
    
    public int mostWordsFound(String[] sentences) {
        int max = 1;
        for(String sentence: sentences) {
            int count = 1;
            for(int i = 0; i < sentence.length(); i++) {
                if(sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            if(count > max) {
                max = count;
            }
        }

        return max;
    }
}
