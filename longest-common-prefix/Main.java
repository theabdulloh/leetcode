class Main {
    public static void main(String[] args) {
        System.out.println(new Main().longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    }

    public String longestCommonPrefix(String[] strs) {
        String example = min(strs), result = "";

        for(int i = 0; i < example.length(); i++) {
            for(String str: strs) {
                if(example.charAt(i) != str.charAt(i)) {
                    return result;
                }
            }

            result = example.substring(0, i + 1);
        }

        return result;
    }

    private String min(String[] strs) {
        String min = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if(strs[i].length() < min.length()) {
                min = strs[i];
            }
        }

        return min;
    }
}
