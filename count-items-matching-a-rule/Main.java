import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().countMatches(List.of(
                List.of("phone", "blue", "pixel"), 
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
            ), "color", "silver"));
    }
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for(List<String> item: items) {
            if("type".equals(ruleKey)) {
                if(ruleValue.equals(item.get(0))) {
                    count++;
                }
            } else if("color".equals(ruleKey)) {
                if(ruleValue.equals(item.get(1))) {
                    count++;
                }
            } else {
                if(ruleValue.equals(item.get(2))) {
                    count++;
                }
            }
        }

        return count;
    }
}