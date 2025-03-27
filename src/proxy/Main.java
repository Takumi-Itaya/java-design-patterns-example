package proxy;

import proxy.example.*;

public class Main {
  public static void main(String[] args) {
    // プロキシを作成
    Image image = new ImageProxy("sample.jpg");

    // 1回目の表示（画像をロード）
    System.out.println("1回目の表示:");
    image.display();

    // 2回目の表示（キャッシュを使用）
    System.out.println("\n2回目の表示:");
    image.display();
  }
}