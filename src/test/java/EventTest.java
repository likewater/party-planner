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
    public void fullBar_extraPerHeadForAlcohol_true() {
      Event event = new Event();
      Integer fullBar = 1000;
      assertEquals(costOfAlcohol, event.extraForAlcohol(true));
    }


}
