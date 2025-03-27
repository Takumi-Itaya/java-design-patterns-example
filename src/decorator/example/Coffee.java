package decorator.example;

public class Coffee implements Beverage {
  @Override
  public String getDescription() {
    return "コーヒー";
  }

  @Override
  public int cost() {
    return 300;
  }
}