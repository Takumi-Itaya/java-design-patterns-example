package facade.example;

public class DvdPlayer {
  public void on() {
    System.out.println("DVDプレーヤーをオンにします");
  }

  public void play(String movie) {
    System.out.println("DVDプレーヤーで「" + movie + "」を再生します");
  }

  public void stop() {
    System.out.println("DVDプレーヤーを停止します");
  }

  public void eject() {
    System.out.println("DVDを排出します");
  }

  public void off() {
    System.out.println("DVDプレーヤーをオフにします");
  }
}