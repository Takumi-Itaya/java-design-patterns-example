package strategy;

import strategy.example.*;

public class Main {
  public static void main(String[] args) {
    // 支払い方法の戦略を作成
    PaymentStrategy creditCardStrategy = new CreditCardStrategy("1234-5678-9012-3456");
    PaymentStrategy paypalStrategy = new PayPalStrategy("example@email.com");
    PaymentStrategy bankTransferStrategy = new BankTransferStrategy("1234567890");
    
    // ショッピングカートを作成
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(new Item("商品A", 1000));
    cart.addItem(new Item("商品B", 2000));
    
    // クレジットカードで支払い
    System.out.println("クレジットカードで支払い:");
    cart.pay(creditCardStrategy);
    
    // PayPalで支払い
    System.out.println("\nPayPalで支払い:");
    cart.pay(paypalStrategy);
    
    // 銀行振込で支払い
    System.out.println("\n銀行振込で支払い:");
    cart.pay(bankTransferStrategy);
  }
} 