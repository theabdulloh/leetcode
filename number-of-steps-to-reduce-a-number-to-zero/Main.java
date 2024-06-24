class Main {
    public static void main(String[] args) {
        System.out.println(new Main().numberOfSteps(14));
    }
    
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0) {
            if(num % 2 == 1) {
                num -= 1;
            } else {
                num /= 2;
            }
            count++;
        }
        
        return count;
    }
}
