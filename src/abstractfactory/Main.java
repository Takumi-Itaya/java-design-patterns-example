package abstractfactory;

import abstractfactory.example.WindowsFactory;

import abstractfactory.example.Button;
import abstractfactory.example.Checkbox;
import abstractfactory.example.GUIFactory;
import abstractfactory.example.MacFactory;

/**
 * Abstract Factoryパターンのデモクラス
 */
public class Main {
  public static void main(String[] args) {
    // WindowsスタイルのGUIを作成
    System.out.println("===== WindowsスタイルのGUI =====");
    GUIFactory windowsFactory = new WindowsFactory();
    Button windowsButton = windowsFactory.createButton("OK", "青");
    Checkbox windowsCheckbox = windowsFactory.createCheckbox("同意する");

    windowsButton.display();
    windowsButton.click();
    windowsCheckbox.display();
    windowsCheckbox.toggle();
    windowsCheckbox.display();

    // MacスタイルのGUIを作成
    System.out.println("\n===== MacスタイルのGUI =====");
    GUIFactory macFactory = new MacFactory();
    Button macButton = macFactory.createButton("OK", "青");
    Checkbox macCheckbox = macFactory.createCheckbox("同意する");

    macButton.display();
    macButton.click();
    macCheckbox.display();
    macCheckbox.toggle();
    macCheckbox.display();

    // OSに依存しないコードが書ける
    System.out.println("\n===== OSに依存しないGUI =====");
    GUIFactory factory;
    String os = "Windows";
    if (os.equals("Windows")) {
      factory = new WindowsFactory();
    } else {
      factory = new MacFactory();
    }

    Button Button = factory.createButton("OK", "青");
    Checkbox Checkbox = factory.createCheckbox("同意する");

    Button.display();
    Button.click();
    Checkbox.display();
    Checkbox.toggle();
    Checkbox.display();

  }
}