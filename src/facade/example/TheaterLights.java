package facade.example;

public class TheaterLights {
  public void dim(int level) {
    System.out.println("シアターライトを" + level + "%の明るさに設定します");
  }

  public void on() {
    System.out.println("シアターライトをオンにします");
  }
}