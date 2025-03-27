package proxy.example;

// 実際の画像クラス（時間のかかる処理をシミュレーション）
public class RealImage implements Image {
  private String filename;

  public RealImage(String filename) {
    this.filename = filename;
    loadFromDisk(); // コンストラクタで画像をロード
  }

  private void loadFromDisk() {
    System.out.println("画像をロード中: " + filename);
    // 実際の画像ロード処理をシミュレート
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void display() {
    System.out.println("画像を表示: " + filename);
  }
}