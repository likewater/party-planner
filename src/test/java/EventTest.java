import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void isEvent_forNumberOfGuests_16() {
    Event event = new Event();
    Integer cost = 16;
    assertEquals(cost, event.isEvent(1));
   }

   @Test
   public void typeOfFood_extraPerHeadForTypeOfFood_5() {
     Event event = new Event();
     Integer costOfFood = 5;
     assertEquals(costOfFood, event.typeOfFood(4));
    }

    @Test
    public void fullBar_extraPerHeadForAlcohol_10() {
      Event event = new Event();
      Integer costOfAlcohol = 10;
      assertEquals(costOfAlcohol, event.extraForAlcohol(1));
    }

    @Test
    public void typeOfEntertainment_extraForTypeOfEntertainment_300() {
      Event event = new Event();
      Integer costOfEntertainment = 300;
      assertEquals(costOfEntertainment, event.extraForEntertainment(1));
    }

    @Test
    public void initialEstimate_addCostsOfAllChoices_331() {
      Event event = new Event();
      Integer initialEstimate = 331;
      assertEquals(initialEstimate, event.initialEstimate(1, 16, 10, 5, 300));
    }

}
