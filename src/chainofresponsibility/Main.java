package chainofresponsibility;

import chainofresponsibility.example.*;

public class Main {
  public static void main(String[] args) {
    // ハンドラーチェーンを作成
    Handler handler1 = new ConcreteHandler1();
    Handler handler2 = new ConcreteHandler2();
    Handler handler3 = new ConcreteHandler3();

    // チェーンを構築
    handler1.setNext(handler2);
    handler2.setNext(handler3);

    // リクエストを送信
    System.out.println("リクエスト1を送信:");
    handler1.handleRequest(1);

    System.out.println("\nリクエスト2を送信:");
    handler1.handleRequest(2);

    System.out.println("\nリクエスト3を送信:");
    handler1.handleRequest(3);

    System.out.println("\nリクエスト4を送信:");
    handler1.handleRequest(4);
  }
} 