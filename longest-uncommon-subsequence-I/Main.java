class Main {
    public static void main(String[] args) {
        System.out.println(new Main().findLUSlength("aba", "cdc"));
    }
    
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : (a.length() >= b.length() ? a.length() : b.length());
    }
}