import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().generate(5));
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(row);

        for(int i = 0; i < numRows - 1; i++) {
            row = generateRows(row);
            result.add(row);
        }
        
        return result;
    }

    private List<Integer> generateRows(List<Integer> row) {
        List<Integer> next = new ArrayList<>();
        next.add(1);

        for(int i = 0; i < row.size() - 1; i++) {
            next.add(row.get(i) + row.get(i + 1));
        }

        next.add(1);
        return next;
    }
}
