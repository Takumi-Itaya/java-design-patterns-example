package chainofresponsibility.example;

public class ConcreteHandler1 implements Handler {
  private Handler next;

  @Override
  public void setNext(Handler handler) {
    this.next = handler;
  }

  @Override
  public void handleRequest(int request) {
    if (request <= 1) {
      System.out.println("ConcreteHandler1がリクエスト" + request + "を処理しました。");
    } else if (next != null) {
      next.handleRequest(request);
    }
  }
} 