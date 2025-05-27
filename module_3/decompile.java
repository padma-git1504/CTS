public class decompile {
    public static void main(String[] args) {
        String message=greet("padma");
        System.out.println(message);
    }
    public static String greet(String name){
        return "hello" + name;
    }
}
