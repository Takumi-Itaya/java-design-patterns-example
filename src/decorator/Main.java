package decorator;

import decorator.example.*;

public class Main {
  public static void main(String[] args) {
    // 基本的なコーヒーを作成
    Beverage coffee = new Coffee();
    System.out.println("基本のコーヒー: " + coffee.getDescription() + " - 価格: " + coffee.cost() + "円");

    // ミルクを追加
    coffee = new Milk(coffee);
    System.out.println("ミルク入りコーヒー: " + coffee.getDescription() + " - 価格: " + coffee.cost() + "円");

    // さらにシュガーを追加
    coffee = new Sugar(coffee);
    System.out.println("ミルクとシュガー入りコーヒー: " + coffee.getDescription() + " - 価格: " + coffee.cost() + "円");

    // 新しい飲み物（紅茶）を作成
    Beverage tea = new Tea();
    System.out.println("\n基本の紅茶: " + tea.getDescription() + " - 価格: " + tea.cost() + "円");

    // レモンを追加
    tea = new Lemon(tea);
    System.out.println("レモン入り紅茶: " + tea.getDescription() + " - 価格: " + tea.cost() + "円");
  }
}