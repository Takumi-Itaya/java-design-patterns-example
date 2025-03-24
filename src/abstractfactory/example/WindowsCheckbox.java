package abstractfactory.example;

/**
 * Windowsスタイルのチェックボックス
 */
public class WindowsCheckbox extends Checkbox {
  public WindowsCheckbox(String label) {
    super(label);
  }

  @Override
  public void display() {
    System.out.println("Windowsスタイルのチェックボックスを表示:");
    System.out.println("ラベル: " + label);
    System.out.println("状態: " + (checked ? "チェック済み" : "未チェック"));
    System.out.println("四角形のチェックボックス");
  }

  @Override
  public void toggle() {
    checked = !checked;
    System.out.println("Windowsチェックボックスの状態が切り替わりました");
  }
}