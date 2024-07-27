import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().cellsInRange("K1:L2"));
    }

    public List<String> cellsInRange(String s) {
        char char1 = s.charAt(0);
        char char2 = s.charAt(3);
        int int1 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int int2 = Integer.parseInt(String.valueOf(s.charAt(4)));

        List<String> list = new ArrayList<>();
        String temp = "";
        for(char i = char1; i <= char2; i++) {
            for(int j = int1; j <= int2; j++) {
                temp = i + String.valueOf(j);
                list.add(temp);
            }
        }

        return list;
    }
}
