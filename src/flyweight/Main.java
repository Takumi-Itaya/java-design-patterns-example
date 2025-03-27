package flyweight;

import flyweight.example.*;
import flyweight.example.Character;

public class Main {
  public static void main(String[] args) {
    // 文字のファクトリーを作成
    CharacterFactory factory = new CharacterFactory();

    // テキストを表示（同じ文字は再利用される）
    String text = "Hello World!";
    System.out.println("テキストを表示します: " + text);

    for (char c : text.toCharArray()) {
      Character character = factory.getCharacter(c);
      character.display();
    }
  }
}