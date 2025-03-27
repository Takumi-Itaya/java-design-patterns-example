package bridge;

import bridge.example.*;

public class Main {
  public static void main(String[] args) {
    // 実装クラスのインスタンスを作成
    DrawingAPI drawingAPI = new DrawingAPI1();

    // 抽象クラスのインスタンスを作成（実装クラスを注入）
    Shape circle = new Circle(1, 2, 3, drawingAPI);
    Shape rectangle = new Rectangle(1, 2, 3, 4, drawingAPI);

    // 図形を描画
    circle.draw();
    rectangle.draw();

    // 別の実装クラスを使用
    drawingAPI = new DrawingAPI2();
    circle = new Circle(1, 2, 3, drawingAPI);
    rectangle = new Rectangle(1, 2, 3, 4, drawingAPI);

    // 図形を描画
    circle.draw();
    rectangle.draw();
  }
}