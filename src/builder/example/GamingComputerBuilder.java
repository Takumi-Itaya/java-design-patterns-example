package builder.example;

/**
 * ゲーミングPC用のビルダー
 */
public class GamingComputerBuilder implements ComputerBuilder {
  private String cpu;
  private String ram;
  private String storage;
  private String gpu;
  private String motherboard;
  private String powerSupply;
  private String caseType;

  @Override
  public ComputerBuilder setCPU(String cpu) {
    this.cpu = cpu;
    return this;
  }

  @Override
  public ComputerBuilder setRAM(String ram) {
    this.ram = ram;
    return this;
  }

  @Override
  public ComputerBuilder setStorage(String storage) {
    this.storage = storage;
    return this;
  }

  @Override
  public ComputerBuilder setGPU(String gpu) {
    this.gpu = gpu;
    return this;
  }

  @Override
  public ComputerBuilder setMotherboard(String motherboard) {
    this.motherboard = motherboard;
    return this;
  }

  @Override
  public ComputerBuilder setPowerSupply(String powerSupply) {
    this.powerSupply = powerSupply;
    return this;
  }

  @Override
  public ComputerBuilder setCase(String caseType) {
    this.caseType = caseType;
    return this;
  }

  @Override
  public Computer build() {
    // ゲーミングPC用のデフォルト値を設定
    if (cpu == null)
      cpu = "Intel Core i9-13900K";
    if (ram == null)
      ram = "32GB DDR5";
    if (storage == null)
      storage = "2TB NVMe SSD";
    if (gpu == null)
      gpu = "NVIDIA RTX 4090";
    if (motherboard == null)
      motherboard = "ASUS ROG MAXIMUS";
    if (powerSupply == null)
      powerSupply = "1200W 80+ Platinum";
    if (caseType == null)
      caseType = "Lian Li O11 Dynamic";

    return new Computer(cpu, ram, storage, gpu, motherboard, powerSupply, caseType);
  }
}