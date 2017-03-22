public class Event {
  //Member Variables
  private Integer mInitialEstimate = 0;
  private Integer mCostOfEntertainment = 0;
  private Integer mCostOfAlcohol = 0;
  private Integer mCostOfFood = 0;
  private Integer mCost = 0;
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
      mCostOfEntertainment = 300;
    } else if (ent == 2) {
      mCostOfEntertainment = 1200;
    } else if (ent == 3) {
      mCostOfEntertainment = 1500;
    } else if (ent == 4) {
      mCostOfEntertainment = 1000;
    } else if (ent == 5) {
      mCostOfEntertainment = 700;
    } else {
      mCostOfEntertainment = 0;
    }
    return mCostOfEntertainment;
  }

  public Integer getExtraForAlcohol(int bar) {
    if (bar == 1) {
      mCostOfAlcohol = 10;
    } else {
      mCostOfAlcohol = 0;
    }
    return mCostOfAlcohol;
  }

  public Integer getTypeOfFood(int type) {
    if (type == 4) {
      mCostOfFood = 5;
    } else if (type == 3) {
      mCostOfFood = 2;
    } else if (type == 2) {
      mCostOfFood = 1;
    } else {
      mCostOfFood = 0;
    }
    return mCostOfFood;
  }

  public Integer getIsEvent(int guests) {
    mCost = 16 * guests;
    return mCost;
  }

  public Integer getInitialEstimate(Integer calculateNow, Integer cost, Integer costOfFood, Integer costOfAlcohol, Integer costOfEntertainment) {
    if (calculateNow == 1) {
    Integer multiplier = cost / 16;
    initialEstimate = (((costOfFood + costOfAlcohol) * multiplier) + cost + costOfEntertainment);
    }
    return initialEstimate;
  }
}
