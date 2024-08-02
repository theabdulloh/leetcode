class Main {
    public static void main(String[] args) {
        System.out.println(new Main().countSeniors(new String[] { "7868190130M7522", "5303914400F9211", "9273338290F4010" }));
    }
    
    public int countSeniors(String[] details) {
        int count = 0;
        for(String detail: details) {

            String age = detail.substring(11, 13);
            if(Integer.valueOf(age) > 60) {
                count++;
            }
        }

        return count;
    }
}