package memento;

import memento.example.*;

public class Main {
  public static void main(String[] args) {
    // ゲームの状態を管理するクラスを作成
    GameState gameState = new GameState();
    
    // ゲームの状態を保存するクラスを作成
    GameStateCaretaker caretaker = new GameStateCaretaker();
    
    // ゲームの状態を変更
    System.out.println("初期状態:");
    gameState.setState("レベル1");
    gameState.printState();
    
    // 状態を保存
    System.out.println("\n状態を保存");
    caretaker.saveState(gameState.createMemento());
    
    // 状態を変更
    System.out.println("\n状態を変更:");
    gameState.setState("レベル2");
    gameState.printState();
    
    // 状態を保存
    System.out.println("\n状態を保存");
    caretaker.saveState(gameState.createMemento());
    
    // 状態を変更
    System.out.println("\n状態を変更:");
    gameState.setState("レベル3");
    gameState.printState();
    
    // 1つ前の状態に戻す
    System.out.println("\n1つ前の状態に戻す:");
    gameState.restoreFromMemento(caretaker.getLastSavedState());
    gameState.printState();
    
    // さらに1つ前の状態に戻す
    System.out.println("\nさらに1つ前の状態に戻す:");
    gameState.restoreFromMemento(caretaker.getLastSavedState());
    gameState.printState();
  }
} 