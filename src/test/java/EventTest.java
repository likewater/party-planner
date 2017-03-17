import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void isEvent_forNumberOfGuests_1600() {
    Event event = new Event();
    Integer cost = 1600;
    assertEquals(cost, event.isEvent(1));
   }

   @Test
   public void typeOfFood_extraPerHeadForTypeOfFood_500() {
     Event event = new Event();
     Integer costOfFood = 500;
     assertEquals(costOfFood, event.typeOfFood(3));
    }

    @Test
    public void fullBar_extraPerHeadForAlcohol_1000() {
      Event event = new Event();
      Integer costOfAlcohol = 1000;
      assertEquals(costOfAlcohol, event.extraForAlcohol(true));
    }

    @Test
    public void typeOfEntertainment_extraForTypeOfEntertainment_30000() {
      Event event = new Event();
      Integer costOfEntertainment = 30000;
      assertEquals(costOfEntertainment, event.extraForEntertainment(1));
    }

    @Test
    public void initialEstimate_addCostsOfAllChoices_322() {
      Event event = new Event();
      Integer initialEstimate = 322;
      assertEquals(initialEstimate, event.initialEstimate(true, 1600, 100, 500, 30000));
    }

}
