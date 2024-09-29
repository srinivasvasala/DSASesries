package ComparablesAndComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<Person>people = new ArrayList<>();
        people.add(new Person("alice",23));
        people.add(new Person("bob",25));
        people.add(new Person("nave",37));
        people.add(new Person("charlie",45));

        Collections.sort(people,new AgeComparator());

        for( Person person:people){
            System.out.println(person.getName()+"-"+person.getAge());
        }

    }
}
