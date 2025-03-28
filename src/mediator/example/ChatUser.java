package mediator.example;

public class ChatUser implements User {
  private ChatMediator mediator;
  private String name;
  
  public ChatUser(ChatMediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }
  
  @Override
  public void send(String message) {
    System.out.println(this.name + "が送信: " + message);
    this.mediator.sendMessage(message, this);
  }
  
  @Override
  public void receive(String message) {
    System.out.println(this.name + "が受信: " + message);
  }
  
  @Override
  public String getName() {
    return this.name;
  }
} 