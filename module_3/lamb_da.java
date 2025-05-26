import java.util.*;

class lamb_da{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("priya","sumi","sri");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Soreted List : ");
        for(String name : names){
            System.out.println(name);
        }
    }
}