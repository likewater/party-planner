public class Event {

  Integer costOfAlcohol = 0;
  Integer costOfFood = 0;
  Integer cost = 0;

  public Integer extraForAlcohol(boolean bar) {
    return costOfAlcohol;
  }

  public Integer typeOfFood(int type) {
    if (type == 3) {
      costOfFood = 500;
    } else if (type == 2) {
      costOfFood = 200;
    } else {
      costOfFood = 0;
    }
    return costOfFood;
  }

  public Integer isEvent(int guests) {
    cost = 1600  * guests;
    return cost;
  }
}
