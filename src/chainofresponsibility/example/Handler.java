package chainofresponsibility.example;

public interface Handler {
  void setNext(Handler handler);
  void handleRequest(int request);
} 