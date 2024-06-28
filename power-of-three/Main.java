class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isPowerOfThree(27));
    }
    
    public boolean isPowerOfThree(int n) {
        if(n <= 0) {
            return false;
        }
        while(n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;
    }
}
