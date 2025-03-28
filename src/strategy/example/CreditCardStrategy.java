package strategy.example;

public class CreditCardStrategy implements PaymentStrategy {
  private String cardNumber;
  
  public CreditCardStrategy(String cardNumber) {
    this.cardNumber = cardNumber;
  }
  
  @Override
  public void pay(int amount) {
    System.out.println(amount + "円をクレジットカード(" + cardNumber + ")で支払いました。");
  }
} 