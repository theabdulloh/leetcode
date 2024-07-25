class Main {
    public static void main(String[] args) {
        System.out.println(new Main().restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
    }

    public String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];

        for(int i = 0; i < str.length; i++) {
            str[indices[i]] = s.charAt(i);
        }

        return new String(str);
    }
}
