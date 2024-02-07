package discription;

import java.util.List;
import java.util.function.Consumer;

public class Functional_Programming {

  // Functional INterface is a functional Interface that has one method in it.

  public static void main(String[] args) {

    var list = List.of("red", "blue", "pink");

    list.forEach(new Consumer<String>() { // Consumer Interface is a Functional Interface

      @Override
      public void accept(String t) {
        System.out.print(t);
        System.out.print(" ");
      }

    });
    System.out.println();

    // Lambdas expression
    list.forEach(System.out::println);
    

    System.out.println();

    list.forEach(s -> {
      System.out.print(s);
      System.out.print(" ");
     
    });

  }

}
