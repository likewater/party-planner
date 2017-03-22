public class Event {
  //Member Variables
  Private Integer mInitialEstimate = 0;
  Private Integer mCostOfEntertainment = 0;
  Private Integer mCostOfAlcohol = 0;
  Private Integer mCostOfFood = 0;
  Private Integer mCost = 0;
  //Constructor
  public Event(int initialEstimate, int costOfEntertainment, int costOfAlcohol, int costOfFood, int cost) {
    mInitialEstimate = initialEstimate;
    mCostOfEntertainment = costOfEntertainment;
    mCostOfAlcohol = costOfAlcohol;
    mCostOfFood = costOfFood;
    mCost = cost;
  }

  public Integer getExtraForEntertainment(int ent) {
    if (ent == 1) {
      costOfEntertainment = 300;
    } else if (ent == 2) {
      costOfEntertainment = 1200;
    } else if (ent == 3) {
      costOfEntertainment = 1500;
    } else if (ent == 4) {
      costOfEntertainment = 1000;
    } else if (ent == 5) {
      costOfEntertainment = 700;
    } else {
      costOfEntertainment = 0;
    }
    return costOfEntertainment;
  }

  public Integer getExtraForAlcohol(int bar) {
    if (bar == 1) {
      costOfAlcohol = 10;
    } else {
      costOfAlcohol = 0;
    }
    return costOfAlcohol;
  }

  public Integer getTypeOfFood(int type) {
    if (type == 4) {
      costOfFood = 5;
    } else if (type == 3) {
      costOfFood = 2;
    } else if (type == 2) {
      costOfFood = 1;
    } else {
      costOfFood = 0;
    }
    return costOfFood;
  }

  public Integer getIsEvent(int guests) {
    cost = 16 * guests;
    return cost;
  }

  public Integer getInitialEstimate(Integer calculateNow, Integer cost, Integer costOfFood, Integer costOfAlcohol, Integer costOfEntertainment) {
    if (calculateNow == 1) {
    Integer multiplier = cost / 16;
    initialEstimate = (((costOfFood + costOfAlcohol) * multiplier) + cost + costOfEntertainment);
    }
    return initialEstimate;
  }
}
