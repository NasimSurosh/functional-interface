package exercise2;

import java.util.ArrayList;
import java.util.List;

class Employee {
  String name;
  String position;
  double salary;

  public Employee(String name, String position, double salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;

  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public double getSalary() {
    return salary;
  }  
}

public class LambdaExercise {

  public static void main(String[] args) {
    
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Kai", "Manager", 42000));
    employees.add(new Employee("Anya", "Developer", 32000));
    employees.add(new Employee("Katya", "Intern", 31000));
    employees.add(new Employee("Karina", "Jonior Devloper", 30000));
    
    
    employees.forEach(employee -> {
      System.out.println(employee.getName() +", "+ employee.getPosition()+ ", " + employee.getSalary());
    });
    
    List<String> annualBonus = calculateBonusAnnaual(employees);
    annualBonus.forEach(bonus -> {
      System.out.println(bonus);
    });

  }

  public static List<String> calculateBonusAnnaual(List<Employee> employees) {

    List<String> bonuses = new ArrayList<>();
    
    employees.forEach(employee -> {
      double bonus;
      switch (employee.getPosition()) {
      case "Manager":
        bonus = employee.getSalary()*0.15;
        break;
      case "Developer":
        bonus = employee.getSalary()*0.10;
        break;
      case "Intern":
        bonus = employee.getSalary()*0.05;
        break;
      default:
        bonus = 0.0;
        break;
      }
      bonuses.add(employee.getName() + " bonus " + bonus);

    });

    return bonuses;

  }

}
