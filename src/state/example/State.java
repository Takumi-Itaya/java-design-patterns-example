package state.example;

// State インターフェース: 状態ごとの動作を定義
public interface State {
  void insertMoney(int amount);
  void purchase();
  void refill(int count);
} 