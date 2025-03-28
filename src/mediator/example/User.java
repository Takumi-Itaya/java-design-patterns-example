package mediator.example;

public interface User {
  void send(String message);
  void receive(String message);
  String getName();
} 