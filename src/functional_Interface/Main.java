package functional_Interface;

@FunctionalInterface
interface Runner {
  void execute();
}

public class Main {

  public static void main(String[] args) {

    Runner run = ()-> {
      System.out.println("Hello world");
    };
    run.execute();
    System.out.println(run instanceof Runner);
    System.out.println(run.getClass());
  }

}
