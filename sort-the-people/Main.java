class Main {
    public static void main(String[] args) {
        System.out.println(new Main().sortPeople(new String[] { "Mary", "John", "Emma" }, new int[] { 180, 165, 170 }));
    }
    
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                if(heights[i] < heights[j]) {
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                    int tempHeight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempHeight;
                }
            }
        }

        return names;
    }
}