package abstractfactory.example;

/**
 * Windowsスタイルのボタン
 */
public class WindowsButton extends Button {
  public WindowsButton(String text, String color) {
    super(text, color);
  }

  @Override
  public void display() {
    System.out.println("Windowsスタイルのボタンを表示:");
    System.out.println("テキスト: " + text);
    System.out.println("色: " + color);
    System.out.println("角が丸い四角形のボタン");
  }

  @Override
  public void click() {
    System.out.println("Windowsボタンがクリックされました");
  }
}