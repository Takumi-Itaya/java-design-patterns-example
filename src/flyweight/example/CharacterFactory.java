package flyweight.example;

import java.util.HashMap;
import java.util.Map;
import java.lang.Character;

public class CharacterFactory {
  private Map<Character, flyweight.example.Character> characters = new HashMap<>();

  public flyweight.example.Character getCharacter(char symbol) {
    // 文字が既に存在する場合は再利用
    if (characters.containsKey(symbol)) {
      return characters.get(symbol);
    }

    // 新しい文字オブジェクトを作成
    flyweight.example.Character character = new ConcreteCharacter(symbol);
    characters.put(symbol, character);
    return character;
  }
}