package strategy.example;

public class BankTransferStrategy implements PaymentStrategy {
  private String accountNumber;
  
  public BankTransferStrategy(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  
  @Override
  public void pay(int amount) {
    System.out.println(amount + "円を銀行振込(口座番号: " + accountNumber + ")で支払いました。");
  }
} 