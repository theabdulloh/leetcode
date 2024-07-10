class Main {
    public static void main(String[] args) {
        System.out.println(new Main().minOperations(new String[] { "d1/", "d2/", "../", "d21/", "./" }));
    }
    
    public int minOperations(String[] logs) {
        int count = 0;
        for(String log: logs) {
            if("../".equals(log) && count != 0) {
                count--;
            }
            if(!"./".equals(log) && !"../".equals(log)) {
                count++;
            }
        }
    
        return count;
    }
}
