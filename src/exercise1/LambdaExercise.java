package exercise1;

import java.util.List;

@FunctionalInterface
interface StringOperation {
  String operator(String str);

}

@FunctionalInterface
interface DataProcessor {
  void process(String data);
}

public class LambdaExercise {

  public static void main(String[] args) {

    List<String> list = List.of("car", "airplane", "ship", "train");
    
    System.out.println("Original list: ");
    list.forEach(original ->{
      
      System.out.println(original);
    });
    
    StringOperation changeToUppercase = str -> str.toUpperCase();
    
    
    System.out.println("\nChanged list: ");
    processData(list, str ->{
      String finalResult = changeToUppercase.operator(str);  
      System.out.println(finalResult);
    });

  }

  public static void processData(List<String> data, DataProcessor processor) {

    for (String string : data) {
      processor.process(string);
    }
  }

}
