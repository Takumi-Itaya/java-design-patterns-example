package templatemethod.example;

public abstract class Beverage {
  // テンプレートメソッド
  public final void prepare() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }
  
  // 共通の基本メソッド
  private void boilWater() {
    System.out.println("お湯を沸かします。");
  }
  
  private void pourInCup() {
    System.out.println("カップに注ぎます。");
  }
  
  // サブクラスで実装する抽象メソッド
  protected abstract void brew();
  protected abstract void addCondiments();
  
  // フックメソッド（オプション）
  protected boolean customerWantsCondiments() {
    return true;
  }
} 