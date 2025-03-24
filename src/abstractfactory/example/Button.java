package abstractfactory.example;

/**
 * ボタンの抽象クラス
 */
public abstract class Button {
  protected String text;
  protected String color;

  public Button(String text, String color) {
    this.text = text;
    this.color = color;
  }

  /**
   * ボタンを表示
   */
  public abstract void display();

  /**
   * ボタンをクリック
   */
  public abstract void click();
}