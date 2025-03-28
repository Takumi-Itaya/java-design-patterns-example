package memento.example;

import java.util.Stack;

public class GameStateCaretaker {
  private Stack<Memento> mementos = new Stack<>();
  
  public void saveState(Memento memento) {
    mementos.push(memento);
  }
  
  public Memento getLastSavedState() {
    if (!mementos.isEmpty()) {
      return mementos.pop();
    }
    return null;
  }
} 