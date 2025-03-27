package proxy.example;

// 遅延ロードを行うプロキシクラス
public class ImageProxy implements Image {
  private String filename;
  private RealImage realImage;

  public ImageProxy(String filename) {
    this.filename = filename;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(filename); // 初回表示時にロード
    }
    realImage.display();
  }
}