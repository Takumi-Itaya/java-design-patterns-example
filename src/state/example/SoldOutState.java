package state.example;

// 売り切れ状態の実装
public class SoldOutState implements State {
  private VendingMachine vendingMachine;
  
  public SoldOutState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }
  
  @Override
  public void insertMoney(int amount) {
    System.out.println("在庫切れです。お金を返却します。");
    vendingMachine.setCurrentMoney(0);
  }
  
  @Override
  public void purchase() {
    System.out.println("在庫切れです。");
  }
  
  @Override
  public void refill(int count) {
    System.out.println("在庫を" + count + "個補充しました。");
    vendingMachine.setCount(count);
    vendingMachine.setState(vendingMachine.getNoMoneyState());
  }
} 