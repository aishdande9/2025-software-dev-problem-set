public class Greeting {
    public static void main(String[] args) {
  PrintName g = name -> System.out.println("Hello "+name);
  g.sayHello("Aishwarya");
    }
}
