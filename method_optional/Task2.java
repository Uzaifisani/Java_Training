package method_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}
public class Task2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Uzaif","Nihal");
        List<Integer> ages= Arrays.asList(23,34);

        BiFunction<String,Integer,Person> personCreator= Person::new;

        List<Person> persons=new ArrayList<>();
        for(int i=0;i<names.size();i++){
            persons.add(personCreator.apply(names.get(i), ages.get(i)));
        }

        persons.forEach(System.out::println);
    }
}
