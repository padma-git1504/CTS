import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("Priya", 22),
            new Person("Sumi", 19),
            new Person("Sri", 25),
            new Person("Ravi", 17)
        );

        System.out.println("All People:");
        people.forEach(System.out::println);
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 20)
                                    .collect(Collectors.toList());

        
        System.out.println("\nPeople aged 20 and above:");
        adults.forEach(System.out::println);
    }
}
