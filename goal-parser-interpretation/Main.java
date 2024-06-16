class Main {
    public static void main(String[] args) {
        System.out.println(new Main().interpret("G()(al)"));
    }
    
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
