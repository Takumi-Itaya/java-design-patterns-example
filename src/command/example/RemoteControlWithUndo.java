package command.example;

import java.util.Stack;

public class RemoteControlWithUndo {
  private Command command;
  private Stack<Command> history = new Stack<>();
  
  public void setCommand(Command command) {
    this.command = command;
  }
  
  public void pressButton() {
    command.execute();
    history.push(command);
  }
  
  public void pressUndoButton() {
    if (!history.isEmpty()) {
      Command lastCommand = history.pop();
      lastCommand.undo();
    }
  }
} 