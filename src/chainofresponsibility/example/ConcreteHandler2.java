package chainofresponsibility.example;

public class ConcreteHandler2 implements Handler {
  private Handler next;

  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handleRequest(int request) {
    if (request <= 2) {
      System.out.println("ConcreteHandler2がリクエスト" + request + "を処理しました。");
    } else if (next != null) {
      next.handleRequest(request);
    }
  }
}