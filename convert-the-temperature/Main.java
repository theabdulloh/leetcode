class Main {
    public static void main(String[] args) {
        System.out.println(new Main().convertTemperature(36.50));
    }
    
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
