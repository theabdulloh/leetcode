class Main {
    public static void main(String[] args) {
        System.out.println(new Main().productExceptSelf(new int[] { 1, 2, 3, 4 }));
    }
    
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = buildPrefix(nums);
        int[] suffix = buildSuffix(nums);

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int product = prefix[i] * suffix[i + 1];
            result[i] = product;
        }

        return result;
    }

    private int[] buildPrefix(int[] array) {
        int[] prefix = new int[array.length + 1];
        prefix[0] = 1;
        int count = 1, product = 1;
        for(int i = 0; i < array.length; i++) {
            product *= array[i];
            prefix[count++] = product;
        }

        return prefix;
    }

    private int[] buildSuffix(int[] array) {
        int[] suffix = new int[array.length + 1];
        suffix[0] = 1;
        int count = 1, product = 1;
        for(int i = array.length - 1; i >= 0; i--) {
            product *= array[i];
            suffix[count++] = product;
        }
        reverse(suffix);

        return suffix;
    }

    private void reverse(int[] array) {
        int i = 0, j = array.length - 1;
        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
    }
}