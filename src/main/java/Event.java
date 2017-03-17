public class Event {

  Integer costOfEntertainment = 0;
  Integer costOfAlcohol = 0;
  Integer costOfFood = 0;
  Integer cost = 0;

  public Integer extraForEntertainment(int ent) {
    if (ent == 1) {
      costOfEntertainment = 30000;
    } else if (ent == 2) {
      costOfEntertainment = 120000;
    } else if (ent == 3) {
      costOfEntertainment = 150000;
    } else if (ent == 4) {
      costOfEntertainment = 100000;
    } else if (ent == 5) {
      costOfEntertainment = 70000;
    } else {
      costOfEntertainment = 0;
    }
    return costOfEntertainment;
  }

  public Integer extraForAlcohol(boolean bar) {
    if (bar == true) {
      costOfAlcohol = 1000;
    } else {
      costOfAlcohol = 0;
    }
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
