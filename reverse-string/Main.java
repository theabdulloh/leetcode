class Main {
    public static void main(String[] args) {
        new Main().reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
    }
    
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while(i <= j) {
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;

            i++;
            j--;
        }
    }
}
