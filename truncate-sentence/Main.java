class Main {
    public static void main(String[] args) {
        System.out.println(new Main().truncateSentence("Hello how are you Contestant", 4));
    }
    
    public String truncateSentence(String s, int k) {
        String ans = "";
        String[] splitted = s.split(" ");
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(i != k - 1) {
                ans += splitted[count++] + " ";
            } else {
                ans += splitted[count++];
            }
        }

        return ans;
    }
}
