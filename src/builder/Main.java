package builder;

import builder.example.Computer;
import builder.example.ComputerBuilder;
import builder.example.ComputerDirector;
import builder.example.GamingComputerBuilder;
import builder.example.OfficeComputerBuilder;

/**
 * Builderパターンのデモクラス
 */
public class Main {
  public static void main(String[] args) {
    // ゲーミングPCのビルダーを作成
    ComputerBuilder gamingBuilder = new GamingComputerBuilder();
    ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);

    System.out.println("===== ハイエンドゲーミングPC =====");
    Computer highEndGamingPC = gamingDirector.constructHighEndGamingPC();
    System.out.println(highEndGamingPC);

    System.out.println("\n===== エントリーゲーミングPC =====");
    Computer entryGamingPC = gamingDirector.constructEntryGamingPC();
    System.out.println(entryGamingPC);

    // オフィスPCのビルダーを作成
    ComputerBuilder officeBuilder = new OfficeComputerBuilder();
    ComputerDirector officeDirector = new ComputerDirector(officeBuilder);

    System.out.println("\n===== ハイエンドオフィスPC =====");
    Computer highEndOfficePC = officeDirector.constructHighEndOfficePC();
    System.out.println(highEndOfficePC);

    System.out.println("\n===== エントリーオフィスPC =====");
    Computer entryOfficePC = officeDirector.constructEntryOfficePC();
    System.out.println(entryOfficePC);

    // カスタムPCの構築例
    System.out.println("\n===== カスタムゲーミングPC =====");
    Computer customGamingPC = gamingBuilder
        .setCPU("AMD Ryzen 9 7950X")
        .setRAM("32GB DDR5")
        .setStorage("2TB NVMe SSD")
        .setGPU("AMD Radeon RX 7900 XTX")
        .setMotherboard("ASUS ROG X670E")
        .setPowerSupply("1000W 80+ Platinum")
        .setCase("Phanteks Enthoo 719")
        .build();
    System.out.println(customGamingPC);
  }
}