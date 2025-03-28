package state.example;

// お金が入っている状態の実装
public class HasMoneyState implements State {
  private VendingMachine vendingMachine;
  
  public HasMoneyState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }
  
  @Override
  public void insertMoney(int amount) {
    System.out.println(amount + "円を追加で投入しました。");
    vendingMachine.setCurrentMoney(vendingMachine.getCurrentMoney() + amount);
  }
  
  @Override
  public void purchase() {
    if (vendingMachine.getCount() > 0) {
      System.out.println("ジュースを購入しました。");
      vendingMachine.setCount(vendingMachine.getCount() - 1);
      vendingMachine.setCurrentMoney(0);
      vendingMachine.setState(vendingMachine.getNoMoneyState());
    } else {
      System.out.println("在庫切れです。");
      vendingMachine.setState(vendingMachine.getSoldOutState());
    }
  }
  
  @Override
  public void refill(int count) {
    System.out.println("在庫を" + count + "個補充しました。");
    vendingMachine.setCount(count);
  }
} 