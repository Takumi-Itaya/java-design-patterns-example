package decorator.example;

public class Sugar extends BeverageDecorator {
  public Sugar(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " + シュガー";
  }

  @Override
  public int cost() {
    return beverage.cost() + 20;
  }
}