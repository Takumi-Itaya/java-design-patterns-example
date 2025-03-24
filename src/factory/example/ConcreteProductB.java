package factory.example;

/**
 * 具体的な製品B
 */
public class ConcreteProductB extends Product {
  private String specification;

  public ConcreteProductB(String name, double price, String specification) {
    super(name, price);
    this.specification = specification;
  }

  @Override
  public void display() {
    System.out.println("製品Bの情報:");
    System.out.println("名前: " + name);
    System.out.println("価格: " + price + "円");
    System.out.println("仕様: " + specification);
  }

  @Override
  public void use() {
    System.out.println("製品Bを使用中: " + specification + "の仕様に基づいて実行");
  }
}