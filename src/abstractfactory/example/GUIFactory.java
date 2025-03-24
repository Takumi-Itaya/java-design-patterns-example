package abstractfactory.example;

/**
 * GUIファクトリーの抽象クラス
 */
public abstract class GUIFactory {
  /**
   * ボタンを作成
   * 
   * @param text  ボタンのテキスト
   * @param color ボタンの色
   * @return 作成されたボタン
   */
  public abstract Button createButton(String text, String color);

  /**
   * チェックボックスを作成
   * 
   * @param label チェックボックスのラベル
   * @return 作成されたチェックボックス
   */
  public abstract Checkbox createCheckbox(String label);
}