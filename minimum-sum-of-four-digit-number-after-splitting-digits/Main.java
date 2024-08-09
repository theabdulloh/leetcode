import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().minimumSum(2932));
    }
    
    public int minimumSum(int num) {
        int[] splitted = new int[4];
        splitted[0] = num / 1000;
        splitted[1] = num / 100 % 10;
        splitted[2] = num % 100 / 10;
        splitted[3] = num % 10;
        Arrays.sort(splitted);
        int num1 = splitted[0] * 10 + splitted[3];
        int num2 = splitted[1] * 10 + splitted[2];

        return num1 + num2;
    }
}
