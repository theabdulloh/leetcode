import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().fizzBuzz(3));
    }
    
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i < n + 1; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if(i % 5 == 0) {
                list.add("Buzz");
            } else if(i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(Integer.toString(i));
            }
        }

        return list;
    }
}
