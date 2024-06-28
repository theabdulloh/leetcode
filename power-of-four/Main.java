class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isPowerOfFour(16));
    }
    
    public boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        }
        while(n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
