package factory.example;

/**
 * 製品の抽象クラス
 */
public abstract class Product {
  protected String name;
  protected double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  /**
   * 製品の情報を表示
   */
  public abstract void display();

  /**
   * 製品の使用
   */
  public abstract void use();
}