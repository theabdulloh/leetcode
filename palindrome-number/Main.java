class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isPalindrome(121));
    }
    
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int temp = x, num = 0;
        while(x != 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }

        return temp == num;
    }
}
