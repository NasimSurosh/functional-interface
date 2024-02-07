package exercise;

import java.util.ArrayList;
import java.util.List;

class Person{
  String name;
  int age;
  String city;
  public Person(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }
  public String getName() {
    return name;
  }
 
  public int getAge() {
    return age;
  }
 
  public String getCity() {
    return city;
  }
  @Override
  public String toString() {
    return "Person name=" + name + ", age=" + age + ", city=" + city;
  }
  
}

public class Lambda_Exercise {

  public static void main(String[] args) {
    
    List<Person> people = new ArrayList<>();
    people.add(new Person("Alix", 44, "heide"));
    people.add(new Person("Katia", 25, "heide"));
    people.add(new Person("Sindora", 31, "heide"));
    people.add(new Person("Kamil", 18, "heide"));
    
    
    
    System.out.println("Original list");
    people.forEach(ol ->{
      System.out.println(ol);
    });
    
    System.out.println();
    System.out.println("filtered list");
    List<String> filter = filterAndTrasform(people);
    filter.forEach( fl ->{
      System.out.println(fl);
    });
    

  }
  public static List<String> filterAndTrasform(List<Person> people) {
    return people.stream().filter(person -> person.getAge() <= 35)
        .map(person  ->  "name is " +  person.getName() + ", age = " + person.getAge()+ ", from " + person.getCity())
        .toList();
    
  }

}
