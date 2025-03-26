package adapter.example;

public class Adapter implements Target {
  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    System.out.println("Adapter: リクエストを変換します");
    adaptee.specificRequest();
  }
}