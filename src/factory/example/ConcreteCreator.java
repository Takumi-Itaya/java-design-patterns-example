package factory.example;

/**
 * 具体的なCreatorクラス
 * 実際の製品生成を担当するクラス
 */
public class ConcreteCreator extends Creator {
  @Override
  public Product createProduct(String type, String name, double price, String param) {
    switch (type.toUpperCase()) {
      case "A":
        return new ConcreteProductA(name, price, param);
      case "B":
        return new ConcreteProductB(name, price, param);
      default:
        throw new IllegalArgumentException("未知の製品タイプ: " + type);
    }
  }
}