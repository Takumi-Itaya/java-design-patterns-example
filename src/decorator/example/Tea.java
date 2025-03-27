package decorator.example;

public class Tea implements Beverage {
  @Override
  public String getDescription() {
    return "紅茶";
  }

  @Override
  public int cost() {
    return 250;
  }
}