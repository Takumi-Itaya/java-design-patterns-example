package mediator;

import mediator.example.*;

public class Main {
  public static void main(String[] args) {
    // メディエーターを作成
    ChatMediator mediator = new ChatRoom();
    
    // ユーザーを作成
    User user1 = new ChatUser(mediator, "田中");
    User user2 = new ChatUser(mediator, "鈴木");
    User user3 = new ChatUser(mediator, "佐藤");
    
    // ユーザーをメディエーターに登録
    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    
    // メッセージを送信
    System.out.println("チャットルームでの会話:");
    user1.send("こんにちは！");
    user2.send("やあ、田中さん！");
    user3.send("みなさん、こんにちは！");
  }
} 