package chainofresponsibility.example;

public class ConcreteHandler3 implements Handler {
  private Handler next;

  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handleRequest(int request) {
    if (request <= 3) {
      System.out.println("ConcreteHandler3がリクエスト" + request + "を処理しました。");
    } else if (next != null) {
      next.handleRequest(request);
    } else {
      System.out.println("どのハンドラーもリクエスト" + request + "を処理できませんでした。");
    }
  }
} 