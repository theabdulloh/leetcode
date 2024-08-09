class Main {
    public static void main(String[] args) {
        System.out.println(new Main().numberOfMatches(7));
    }
    
    public int numberOfMatches(int n) {
        int count = 0;
        while(n > 1) {
            if(n % 2 == 1) {
                count += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            } else {
                count += n / 2;
                n = n / 2;
            }
        }

        return count;
    }
}
