class Main {
    public static void main(String[] args) {
        System.out.println(new Main().numWaterBottles(9, 3));
    }
    
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0, reminder = 0;
        while(numBottles > 0) {
            sum += numBottles;
            numBottles += reminder;
            reminder = numBottles % numExchange;
            numBottles /= numExchange;
        }

        return sum;
    }
}
