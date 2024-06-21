class Main {
    public static void main(String[] args) {
        System.out.println(new Main().balancedStringSplit("RLRRLLRLRL"));
    }
    
    public int balancedStringSplit(String s) {
        int count = 0, countL = 0, countR = 0;;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                countL++;
            } else {
                countR++;
            }
            if(countL == countR) {
                count++;
                countL = 0;
                countR = 0;
            }
        }
        
        return count;
    }
}
