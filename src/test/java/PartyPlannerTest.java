import org.junit.*;
import static org.junit.Assert.*;

public class PartyPlannerTest {
  @Test
  public void isPartyPlanner_forNumberOfGuests_1600() {
    PartyPlanner partyPlanner = new PartyPlanner();
    assertEquals(1600, partyPlanner.isPartyPlanner(1));
   }
}
