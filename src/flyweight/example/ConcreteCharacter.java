package flyweight.example;

public class ConcreteCharacter implements Character {
  private char symbol;

  public ConcreteCharacter(char symbol) {
    this.symbol = symbol;
  }

  @Override
  public void display() {
    System.out.print(symbol);
  }
}