class Main {
    public static void main(String[] args) {
        System.out.println(new Main().defangIPaddr("1.1.1.1"));
    }
    
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
