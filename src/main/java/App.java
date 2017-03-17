import java.io.Console;

public class App {
  public static void main(Strings[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Pat's Party Planning Page!");
    System.out.println("Please follow the prompts for your estimate.");
    System.out.println("Question 1: How many people will be attending?");
    Integer guests = myConsole.readLine();
    System.out.println("Question 2: What basic kind of meal do you want?");
    System.out.println("1: Breakfast, 2: Lunch, 3: Dinner, 4: Fine Dining, 5: Light Snacks");
    System.out.println("Please respond with the appropriate NUMBER");
    Integer type = myConsole.readLine();
    System.out.println("Question 3: Does your party need a Full Bar?");
    System.out.println("If yes, respond with true, if no false");
    boolean bar = myConsole.readLine();
    System.out.println("Question 4: Do you need entertainment?");
    System.out.println("0: No, 1: Carl the Comedian, 2: Chamber Music, 3: Rock n Roll, 4: Jazz, 5: Marty the Mitzvah MC");
    System.out.println("Please respond with the appropriate NUMBER");
    Integer ent = myConsole.readLine();
  }

}
