class Main {
    public static void main(String[] args) {
        System.out.println(new Main().smallestEvenMultiple(5));
    }
    
    public int smallestEvenMultiple(int n) {
        return n % 2 == 1 ? n * 2 : n;
    }
}
