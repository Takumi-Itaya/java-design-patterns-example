package builder.example;

/**
 * パソコン生成を指揮するDirectorクラス
 */
public class ComputerDirector {
  private ComputerBuilder builder;

  public ComputerDirector(ComputerBuilder builder) {
    this.builder = builder;
  }

  /**
   * ハイエンドゲーミングPCを構築
   */
  public Computer constructHighEndGamingPC() {
    return builder
        .setCPU("Intel Core i9-13900K")
        .setRAM("64GB DDR5")
        .setStorage("4TB NVMe SSD")
        .setGPU("NVIDIA RTX 4090")
        .setMotherboard("ASUS ROG MAXIMUS")
        .setPowerSupply("1600W 80+ Titanium")
        .setCase("Lian Li O11 Dynamic XL")
        .build();
  }

  /**
   * エントリーゲーミングPCを構築
   */
  public Computer constructEntryGamingPC() {
    return builder
        .setCPU("Intel Core i5-13600K")
        .setRAM("32GB DDR5")
        .setStorage("2TB NVMe SSD")
        .setGPU("NVIDIA RTX 4070")
        .setMotherboard("MSI B660")
        .setPowerSupply("850W 80+ Gold")
        .setCase("Phanteks P400A")
        .build();
  }

  /**
   * ハイエンドオフィスPCを構築
   */
  public Computer constructHighEndOfficePC() {
    return builder
        .setCPU("Intel Core i7-13700")
        .setRAM("32GB DDR4")
        .setStorage("1TB SSD")
        .setGPU("Intel UHD Graphics")
        .setMotherboard("ASUS Prime B660")
        .setPowerSupply("650W 80+ Gold")
        .setCase("Fractal Design Define 7")
        .build();
  }

  /**
   * エントリーオフィスPCを構築
   */
  public Computer constructEntryOfficePC() {
    return builder
        .setCPU("Intel Core i3-13100")
        .setRAM("16GB DDR4")
        .setStorage("512GB SSD")
        .setGPU("Intel UHD Graphics")
        .setMotherboard("ASUS Prime B660")
        .setPowerSupply("450W 80+ Bronze")
        .setCase("Fractal Design Define C")
        .build();
  }
}