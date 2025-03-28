package memento.example;

public class GameState {
  private String state;
  
  public void setState(String state) {
    this.state = state;
  }
  
  public String getState() {
    return state;
  }
  
  public Memento createMemento() {
    return new Memento(state);
  }
  
  public void restoreFromMemento(Memento memento) {
    state = memento.getState();
  }
  
  public void printState() {
    System.out.println("現在の状態: " + state);
  }
} 