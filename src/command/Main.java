package command;

import command.example.*;

public class Main {
  public static void main(String[] args) {
    // レシーバーを作成
    Light light = new Light();
    
    // コマンドを作成
    Command lightOn = new LightOnCommand(light);
    Command lightOff = new LightOffCommand(light);
    
    // インボーカーを作成
    RemoteControl remote = new RemoteControl();
    
    // コマンドを実行
    System.out.println("ライトをオンにします:");
    remote.setCommand(lightOn);
    remote.pressButton();
    
    System.out.println("\nライトをオフにします:");
    remote.setCommand(lightOff);
    remote.pressButton();
    
    // コマンド履歴を追加したインボーカーを作成
    RemoteControlWithUndo remoteWithUndo = new RemoteControlWithUndo();
    
    // コマンドを実行して履歴を使用
    System.out.println("\n履歴機能付きリモコンでライトをオンにします:");
    remoteWithUndo.setCommand(lightOn);
    remoteWithUndo.pressButton();
    
    System.out.println("\n履歴機能付きリモコンでライトをオフにします:");
    remoteWithUndo.setCommand(lightOff);
    remoteWithUndo.pressButton();
    
    System.out.println("\n操作を元に戻します:");
    remoteWithUndo.pressUndoButton();
  }
} 