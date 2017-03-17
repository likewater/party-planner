public class Event {

  Integer initialEstimate = 0;
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

  public Integer extraForAlcohol(int bar) {
    if (bar == 1) {
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
    } else if (type == 1) {
      costOfFood = 100;
    } else {
      costOfFood = 0;
    }
    return costOfFood;
  }

  public Integer isEvent(int guests) {
    cost = 1600  * guests;
    return cost;
  }

  public Integer initialEstimate(Integer calculateNow, Integer cost, Integer costOfFood, Integer costOfAlcohol, Integer costOfEntertainment) {
    if (calculateNow == 1) {
    Integer multiplier = cost / 1600;
    initialEstimate = ((costOfFood + costOfAlcohol * multiplier) + cost + costOfEntertainment) / 100;
    }
    return initialEstimate;
  }
}
