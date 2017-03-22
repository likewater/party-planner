import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void getIsEvent_forNumberOfGuests_16() {
    Event event = new Event();
    Integer cost = 16;
    assertEquals(cost, event.getIsEvent(1));
   }

   @Test
   public void getTypeOfFood_extraPerHeadForTypeOfFood_5() {
     Event event = new Event();
     Integer costOfFood = 5;
     assertEquals(costOfFood, event.getTypeOfFood(4));
    }

    @Test
    public void getExtraForAlcohol_extraPerHeadForAlcohol_10() {
      Event event = new Event();
      Integer costOfAlcohol = 10;
      assertEquals(costOfAlcohol, event.getExtraForAlcohol(1));
    }

    @Test
    public void getExtraForEntertainment_extraForTypeOfEntertainment_300() {
      Event event = new Event();
      Integer costOfEntertainment = 300;
      assertEquals(costOfEntertainment, event.getExtraForEntertainment(1));
    }

    @Test
    public void getInitialEstimate_addCostsOfAllChoices_331() {
      Event event = new Event();
      Integer initialEstimate = 331;
      assertEquals(initialEstimate, event.getInitialEstimate(1, 16, 10, 5, 300));
    }

}
