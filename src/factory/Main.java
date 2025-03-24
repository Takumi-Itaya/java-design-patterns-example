package factory;

import factory.example.ConcreteCreator;
import factory.example.Creator;

public class Main {
  public static void main(String[] args) {
    // Creatorのインスタンスを作成
    Creator creator = new ConcreteCreator();

    System.out.println("===== 製品Aの生成と使用 =====");
    creator.useProduct("A", "高性能PC", 150000, "最新のCPU搭載");

    System.out.println("\n===== 製品Bの生成と使用 =====");
    creator.useProduct("B", "プリンター", 50000, "カラーレーザー");

    System.out.println("\n===== 無効な製品タイプのテスト =====");
    try {
      creator.useProduct("C", "無効な製品", 1000, "テスト");
    } catch (IllegalArgumentException e) {
      System.out.println("エラー: " + e.getMessage());
    }
  }
}
