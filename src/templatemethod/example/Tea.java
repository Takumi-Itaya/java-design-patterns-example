package templatemethod.example;

public class Tea extends Beverage {
  @Override
  protected void brew() {
    System.out.println("紅茶を浸します。");
  }
  
  @Override
  protected void addCondiments() {
    System.out.println("レモンを追加します。");
  }
  
  @Override
  protected boolean customerWantsCondiments() {
    // レモンの要否をユーザーに確認する処理を実装
    return true;
  }
} 