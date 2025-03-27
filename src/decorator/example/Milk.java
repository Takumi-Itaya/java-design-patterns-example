package decorator.example;

public class Milk extends BeverageDecorator {
  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " + ミルク";
  }

  @Override
  public int cost() {
    return beverage.cost() + 50;
  }
}