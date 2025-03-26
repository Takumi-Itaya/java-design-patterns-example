package adapter;

import adapter.example.*;

public class Main {
  public static void main(String[] args) {

    // 既存のシステムで使用されているクラス
    Adaptee adaptee = new Adaptee();

    // Adapterを使ってクライアントが期待するインターフェースに変換
    Target target = new Adapter(adaptee);
    target.request();
  }
}