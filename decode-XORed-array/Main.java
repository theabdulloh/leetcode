class Main {
    public static void main(String[] args) {
        System.out.println(new Main().decode(new int[] { 1, 2, 3 }, 1));
    }
    
    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for(int i = 0; i < encoded.length; i++) {
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }

        return decoded;
    }
}
