class Main {
    public static void main(String[] args) {
        System.out.println(new Main().numberOfEmployeesWhoMetTarget(new int[] {0, 1, 2, 3, 4}, 2));
    }
    
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i < hours.length; i++) {
            if(hours[i] >= target) {
                count++;
            }
        }
        return count;
    }
}
