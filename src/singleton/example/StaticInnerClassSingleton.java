package singleton.example;

/**
 * 静的内部クラスを使用したシングルトンパターン実装
 * この実装は以下の利点があります：
 * 1. 遅延初期化（Lazy Initialization）
 * 2. スレッドセーフ
 * 3. シンプルな実装
 */
public class StaticInnerClassSingleton {
  // コンストラクタをprivateにしてインスタンス化を制限
  private StaticInnerClassSingleton() {
    System.out.println("StaticInnerClassSingletonインスタンスが生成されました");
  }

  /**
   * 静的内部クラス
   * このクラスはStaticInnerClassSingletonがロードされても、
   * getInstance()が呼ばれるまでロードされない
   */
  private static class SingletonHolder {
    private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
  }

  /**
   * シングルトンインスタンスを取得するメソッド
   * 
   * @return シングルトンインスタンス
   */
  public static StaticInnerClassSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  /**
   * サンプルメソッド
   */
  public void showMessage() {
    System.out.println("静的内部クラスを使用したシングルトンパターンの例です");
  }

  /**
   * 追加のサンプルメソッド
   */
  public void doSomething() {
    System.out.println("静的内部クラスシングルトンで処理を実行中...");
  }
}