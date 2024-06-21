class Main {
    public static void main(String[] args) {
        System.out.println(new Main().reversePrefix("abcdefd", 'd'));
    }
    
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = word.indexOf(ch);
        if(index >= 0) {
            for(int i = index; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            for(int i = index + 1; i < word.length(); i++) {
                sb.append(word.charAt(i));
            }

            return sb.toString();
        }

        return word;
    }
}
