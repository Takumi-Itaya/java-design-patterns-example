package singleton.example;

/**
 * シングルトンパターンの基本的な実装
 */
public class Singleton {
  // 唯一のインスタンスを保持する静的変数
  private static Singleton instance;

  // コンストラクタをprivateにしてインスタンス化を制限
  private Singleton() {
    System.out.println("Singletonインスタンスが生成されました");
  }

  /**
   * シングルトンインスタンスを取得するメソッド
   */
  public static Singleton getInstance() {
    // インスタンスがまだ作成されていない場合のみ新規作成
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("シングルトンパターンの例です");
  }
}