package abstractfactory.example;

/**
 * WindowsスタイルのGUIファクトリー
 */
public class WindowsFactory extends GUIFactory {
  @Override
  public Button createButton(String text, String color) {
    return new WindowsButton(text, color);
  }

  @Override
  public Checkbox createCheckbox(String label) {
    return new WindowsCheckbox(label);
  }
}