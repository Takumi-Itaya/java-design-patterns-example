package abstractfactory.example;

/**
 * Macスタイルのボタン
 */
public class MacButton extends Button {
  public MacButton(String text, String color) {
    super(text, color);
  }

  @Override
  public void display() {
    System.out.println("Macスタイルのボタンを表示:");
    System.out.println("テキスト: " + text);
    System.out.println("色: " + color);
    System.out.println("グラデーションのある丸みを帯びたボタン");
  }

  @Override
  public void click() {
    System.out.println("Macボタンがクリックされました");
  }
}