package facade.example;

public class Amplifier {
  public void on() {
    System.out.println("アンプをオンにします");
  }

  public void setVolume(int level) {
    System.out.println("アンプの音量を" + level + "に設定します");
  }

  public void setDvd(DvdPlayer dvd) {
    System.out.println("アンプをDVDプレーヤーに接続します");
  }

  public void setSurroundSound() {
    System.out.println("アンプをサラウンドモードに設定します");
  }

  public void off() {
    System.out.println("アンプをオフにします");
  }
}