package factory.example;

/**
 * Creator抽象クラス
 * 製品の生成を担当する抽象クラス
 */
public abstract class Creator {
  /**
   * 製品を生成する抽象メソッド
   */
  public abstract Product createProduct(String type, String name, double price, String param);

  /**
   * 製品を使用するテンプレートメソッド
   */
  public void useProduct(String type, String name, double price, String param) {
    Product product = createProduct(type, name, price, param);
    product.display();
    product.use();
  }
}