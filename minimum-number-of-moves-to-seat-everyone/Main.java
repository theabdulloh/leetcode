import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().minMovesToSeat(new int[] { 3, 1, 5 }, new int[] { 2, 7, 4 }));
    }
    
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;

        for(int i = 0; i < students.length; i++) {
            count += Math.abs(students[i] - seats[i]);
        }

        return count;
    }
}
