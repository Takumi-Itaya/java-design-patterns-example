package facade;

import facade.example.*;

public class Main {
  public static void main(String[] args) {
    // ホームシアターシステムのファサードを作成
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(
        new Amplifier(),
        new Tuner(),
        new DvdPlayer(),
        new CdPlayer(),
        new Projector(),
        new TheaterLights(),
        new Screen(),
        new PopcornPopper());

    // 映画鑑賞の準備
    System.out.println("映画鑑賞の準備を開始します...");
    homeTheater.watchMovie("インターステラー");

    // 映画鑑賞の終了
    System.out.println("\n映画鑑賞を終了します...");
    homeTheater.endMovie();
  }
}