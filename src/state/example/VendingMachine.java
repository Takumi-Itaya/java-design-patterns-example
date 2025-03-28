package state.example;

// コンテキストクラス: 状態を管理する
public class VendingMachine {
  private State noMoneyState;
  private State hasMoneyState;
  private State soldOutState;
  private State currentState;
  private int count;
  private int currentMoney;
  
  public VendingMachine() {
    noMoneyState = new NoMoneyState(this);
    hasMoneyState = new HasMoneyState(this);
    soldOutState = new SoldOutState(this);
    currentState = noMoneyState;
    count = 0;
    currentMoney = 0;
  }
  
  public void insertMoney(int amount) {
    currentState.insertMoney(amount);
  }
  
  public void purchase() {
    currentState.purchase();
  }
  
  public void refill(int count) {
    currentState.refill(count);
  }
  
  public void setState(State state) {
    currentState = state;
  }
  
  public State getNoMoneyState() {
    return noMoneyState;
  }
  
  public State getHasMoneyState() {
    return hasMoneyState;
  }
  
  public State getSoldOutState() {
    return soldOutState;
  }
  
  public int getCount() {
    return count;
  }
  
  public void setCount(int count) {
    this.count = count;
  }
  
  public int getCurrentMoney() {
    return currentMoney;
  }
  
  public void setCurrentMoney(int currentMoney) {
    this.currentMoney = currentMoney;
  }
} 