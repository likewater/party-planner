import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Event event = new Event();
    System.out.println("Welcome to Pat's Party Planning Page!");
    System.out.println("Please follow the prompts for your estimate.");
    System.out.println("Question 1: How many people will be attending?");
    String guestsInput = myConsole.readLine();
    int guests = Integer.parseInt(guestsInput);
    System.out.println("Question 2: What basic kind of meal do you want?");
    System.out.println("1: Breakfast, 2: Lunch, 3: Dinner, 4: Fine Dining, 5: Light Snacks");
    System.out.println("Please respond with the appropriate NUMBER");
    String typeInput = myConsole.readLine();
    int type = Integer.parseInt(typeInput);
    System.out.println("Question 3: Does your party need a Full Bar?");
    System.out.println("Please respond with the appropriate NUMBER");
    System.out.println("1: yes, 2: no");
    String barInput = myConsole.readLine();
    int bar = Integer.parseInt(barInput);
    System.out.println("Question 4: Do you need entertainment?");
    System.out.println("Please respond with the appropriate NUMBER");
    System.out.println("1: Carl the Comedian, 2: Chamber Music, 3: Rock n Roll, 4: Jazz, 5: Marty the Mitzvah MC 6: None");
    String entInput = myConsole.readLine();
    int ent = Integer.parseInt(entInput);
//add coupon price reduction message here
    System.out.println("Question 5: Do you have a coupon?");
    System.out.println("Please respond with the appropriate NUMBER");
    System.out.println("1: Yes, 2: No");
    String couponInput = myConsole.readLine();
    int coupon = Integer.parseInt(couponInput);
    System.out.println("Enter your coupon number or enter 0");
    String couponNumberInput = myConsole.readLine();
    int couponNumber = Integer.parseInt(couponNumberInput);
    System.out.println("Question 6: Are you ready to calculate your estimate?");
    System.out.println("Please respond with the appropriate NUMBER");
    System.out.println("1: Yes, 2: No");
    String calculateNowInput = myConsole.readLine();
//install coupon logic in front end
    int calculateNow = Integer.parseInt(calculateNowInput);
    Integer estimateResult = event.initialEstimate(calculateNow, event.isEvent(guests), event.typeOfFood(type), event.extraForAlcohol(bar), event.extraForEntertainment(ent));
      if (coupon == 1) {
        Double newResult = (double)estimateResult * 0.9;
        System.out.println("The price for your party is: $" + newResult);
        System.out.println("You saved 10 percent");
      } else {
        System.out.println("The price for your party is: $" + estimateResult);
    }
  }

}
