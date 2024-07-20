class Main {
    public static void main(String[] args) {
        System.out.println(new Main().detectCapitalUse("USA"));
    }
    
    public boolean detectCapitalUse(String word) {
        if(isUpperCase(word) || isLowerCase(word)) {
            return true;
        }

        return isUpperCase(word.substring(0, 1)) && isLowerCase(word.substring(1));
    }

    private boolean inRange(String word, int start, int end) {
        for(int i = 0; i < word.length(); i++) {
            if(!((int) word.charAt(i) >= start && (int) word.charAt(i) <= end)) {
                return false;
            }
        }

        return true;
    }

    private boolean isUpperCase(String word) {
        return this.inRange(word, 'A', 'Z');
    }

    private boolean isLowerCase(String word) {
        return this.inRange(word, 'a', 'z');
    }
}
