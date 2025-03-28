package state;

import state.example.*;

public class Main {
  public static void main(String[] args) {
    // 自動販売機を作成
    VendingMachine vendingMachine = new VendingMachine();
    
    // 初期状態（お金なし）でジュースを購入しようとする
    System.out.println("初期状態でジュースを購入:");
    vendingMachine.insertMoney(100);
    vendingMachine.purchase();
    
    // お金を入れてジュースを購入
    System.out.println("\nお金を入れてジュースを購入:");
    vendingMachine.insertMoney(100);
    vendingMachine.purchase();
    
    // 在庫切れの状態でジュースを購入しようとする
    System.out.println("\n在庫切れの状態でジュースを購入:");
    vendingMachine.insertMoney(100);
    vendingMachine.purchase();
    
    // 在庫を補充
    System.out.println("\n在庫を補充:");
    vendingMachine.refill(5);
    
    // 再度ジュースを購入
    System.out.println("\n在庫補充後、ジュースを購入:");
    vendingMachine.insertMoney(100);
    vendingMachine.purchase();
  }
} 