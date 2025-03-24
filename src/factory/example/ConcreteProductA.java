package factory.example;

/**
 * 具体的な製品A
 */
public class ConcreteProductA extends Product {
  private String feature;

  public ConcreteProductA(String name, double price, String feature) {
    super(name, price);
    this.feature = feature;
  }

  @Override
  public void display() {
    System.out.println("製品Aの情報:");
    System.out.println("名前: " + name);
    System.out.println("価格: " + price + "円");
    System.out.println("特徴: " + feature);
  }

  @Override
  public void use() {
    System.out.println("製品Aを使用中: " + feature + "の機能を実行");
  }
}