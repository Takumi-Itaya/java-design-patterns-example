package abstractfactory.example;

/**
 * Macスタイルのチェックボックス
 */
public class MacCheckbox extends Checkbox {
  public MacCheckbox(String label) {
    super(label);
  }

  @Override
  public void display() {
    System.out.println("Macスタイルのチェックボックスを表示:");
    System.out.println("ラベル: " + label);
    System.out.println("状態: " + (checked ? "チェック済み" : "未チェック"));
    System.out.println("丸みを帯びたチェックボックス");
  }

  @Override
  public void toggle() {
    checked = !checked;
    System.out.println("Macチェックボックスの状態が切り替わりました");
  }
}