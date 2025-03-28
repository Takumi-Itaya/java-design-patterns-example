package strategy.example;

public class PayPalStrategy implements PaymentStrategy {
  private String email;
  
  public PayPalStrategy(String email) {
    this.email = email;
  }
  
  @Override
  public void pay(int amount) {
    System.out.println(amount + "円をPayPal(" + email + ")で支払いました。");
  }
} 