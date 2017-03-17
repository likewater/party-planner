import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void isEvent_forNumberOfGuests_1600() {
    Event event = new Event();
    Integer cost = 1600;
    assertEquals(cost, event.isEvent(1));
   }
}
