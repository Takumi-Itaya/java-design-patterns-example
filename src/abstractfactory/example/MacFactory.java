package abstractfactory.example;

/**
 * MacスタイルのGUIファクトリー
 */
public class MacFactory extends GUIFactory {
  @Override
  public Button createButton(String text, String color) {
    return new MacButton(text, color);
  }

  @Override
  public Checkbox createCheckbox(String label) {
    return new MacCheckbox(label);
  }
}