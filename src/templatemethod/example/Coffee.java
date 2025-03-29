package templatemethod.example;

public class Coffee extends Beverage {
  @Override
  protected void brew() {
    System.out.println("コーヒーをドリップします。");
  }
  
  @Override
  protected void addCondiments() {
    System.out.println("砂糖とミルクを追加します。");
  }
} 