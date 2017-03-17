import java.io.Console;

public class App {
  public static void main(Strings[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Pat's Party Planning Page!");
    System.out.println("Please follow the prompts for your estimate.");
    System.out.println("Question 1: How many people will be attending?");
    Integer guests = myConsole.readLine();
  }

}
