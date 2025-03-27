package decorator.example;

public abstract class BeverageDecorator implements Beverage {
  protected Beverage beverage;

  public BeverageDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription();
  }

  @Override
  public int cost() {
    return beverage.cost();
  }
}