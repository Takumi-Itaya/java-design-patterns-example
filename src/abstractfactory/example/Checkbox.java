package abstractfactory.example;

/**
 * チェックボックスの抽象クラス
 */
public abstract class Checkbox {
  protected String label;
  protected boolean checked;

  public Checkbox(String label) {
    this.label = label;
    this.checked = false;
  }

  /**
   * チェックボックスを表示
   */
  public abstract void display();

  /**
   * チェックボックスの状態を切り替え
   */
  public abstract void toggle();
}