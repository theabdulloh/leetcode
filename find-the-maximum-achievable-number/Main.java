class Main {
    public static void main(String[] args) {
        System.out.println(new Main().theMaximumAchievableX(4, 1));
    }
    
    public int theMaximumAchievableX(int num, int t) {
        return t * 2 + num;
    }
}
