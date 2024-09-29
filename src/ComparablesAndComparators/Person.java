package ComparablesAndComparators;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    List<Person> people = new ArrayList<>();


    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age,other.age);
    }
}
