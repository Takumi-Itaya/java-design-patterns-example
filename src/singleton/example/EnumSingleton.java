package singleton.example;

/**
 * 列挙型を使用したシングルトンパターン実装
 * これはJoshua Blochの「Effective Java」で推奨されている方法で、
 * 最もシンプルで安全なシングルトン実装方法です。
 */
public enum EnumSingleton {
  INSTANCE;

  private EnumSingleton() {
    System.out.println("EnumSingletonインスタンスが生成されました");
  }

  /**
   * サンプルメソッド
   */
  public void showMessage() {
    System.out.println("Enumを利用したシングルトンパターンの例です");
  }

  /**
   * 任意のメソッドを定義できます
   */
  public void doSomething() {
    System.out.println("何か処理を実行しています...");
  }
}