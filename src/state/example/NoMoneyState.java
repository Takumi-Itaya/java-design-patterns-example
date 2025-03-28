package state.example;

// お金が入っていない状態の実装
public class NoMoneyState implements State {
  private VendingMachine vendingMachine;
  
  public NoMoneyState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }
  
  @Override
  public void insertMoney(int amount) {
    System.out.println(amount + "円を投入しました。");
    vendingMachine.setCurrentMoney(amount);
    vendingMachine.setState(vendingMachine.getHasMoneyState());
  }
  
  @Override
  public void purchase() {
    System.out.println("お金を入れてください。");
  }
  
  @Override
  public void refill(int count) {
    System.out.println("在庫を" + count + "個補充しました。");
    vendingMachine.setCount(count);
  }
} 