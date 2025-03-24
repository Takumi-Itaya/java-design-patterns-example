package singleton.example;

/**
 * スレッドセーフなシングルトンパターンの実装
 */
public class ThreadSafeSingleton {
  // volatile キーワードを使用して複数スレッドでの可視性を保証
  private static volatile ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {
    System.out.println("ThreadSafeSingletonインスタンスが生成されました");
  }

  /**
   * 二重チェックロッキングによるスレッドセーフなシングルトン取得メソッド
   * 
   * @return シングルトンインスタンス
   */
  public static ThreadSafeSingleton getInstance() {
    // 最初のチェック（ロック取得前）
    if (instance == null) {
      // クラスレベルでのロック
      synchronized (ThreadSafeSingleton.class) {
        // 二回目のチェック（ロック取得後）
        if (instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }

  /**
   * サンプルメソッド
   */
  public void showMessage() {
    System.out.println("スレッドセーフなシングルトンパターンの例です");
  }
}