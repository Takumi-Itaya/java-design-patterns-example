package builder.example;

/**
 * パソコンクラス
 */
public class Computer {
  private String cpu;
  private String ram;
  private String storage;
  private String gpu;
  private String motherboard;
  private String powerSupply;
  private String caseType;

  public Computer(String cpu, String ram, String storage, String gpu,
      String motherboard, String powerSupply, String caseType) {
    this.cpu = cpu;
    this.ram = ram;
    this.storage = storage;
    this.gpu = gpu;
    this.motherboard = motherboard;
    this.powerSupply = powerSupply;
    this.caseType = caseType;
  }

  @Override
  public String toString() {
    return "パソコン仕様:\n" +
        "CPU: " + cpu + "\n" +
        "RAM: " + ram + "\n" +
        "ストレージ: " + storage + "\n" +
        "GPU: " + gpu + "\n" +
        "マザーボード: " + motherboard + "\n" +
        "電源: " + powerSupply + "\n" +
        "ケース: " + caseType;
  }
}