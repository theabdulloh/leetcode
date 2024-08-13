class Main {
    public static void main(String[] args) {
        System.out.println(new Main().strStr("sadbutsad", "sad"));
    }
    
    public int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();

        if(needleLen == haystackLen && haystack.equals(needle)) {
            return 0;
        }

        for(int i = 0; i <= haystackLen - needleLen; i++) {
            String subStr = haystack.substring(i, needleLen + i);
            System.out.println(subStr);
            if(subStr.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
