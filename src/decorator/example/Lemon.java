package decorator.example;

public class Lemon extends BeverageDecorator {
  public Lemon(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " + レモン";
  }

  @Override
  public int cost() {
    return beverage.cost() + 30;
  }
}