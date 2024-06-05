class Main {
    public static void main(String[] args) {
        System.out.println(new Main().subtractProductAndSum(234));
    }
    
    public int subtractProductAndSum(int n) {
        int sum = calculate(n, '+');
        int product = calculate(n, '*');
        
        return product - sum;
    }

    private int calculate(int n, char symbol) {
        int sum = 0, product = 1;
        while(n > 0) {
            if(symbol == '+') {
                sum += n % 10;
            } else {
                product *= n % 10;
            }
            n /= 10;
        }

        return symbol == '+' ? sum : product;
    }
}
