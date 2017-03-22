public class Event {
  //Member Variables
  private Integer mInitialEstimate = 0;
  private Integer mCostOfEntertainment = 0;
  private Integer mCostOfAlcohol = 0;
  private Integer mCostOfFood = 0;
  private Integer mCost = 0;
  
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

  public Integer getInitialEstimate(Integer calculateNow, Integer mCost, Integer mCostOfFood, Integer mCostOfAlcohol, Integer mCostOfEntertainment) {
    if (calculateNow == 1) {
    Integer multiplier = mCost / 16;
    mInitialEstimate = (((mCostOfFood + mCostOfAlcohol) * multiplier) + mCost + mCostOfEntertainment);
    }
    return mInitialEstimate;
  }
}
