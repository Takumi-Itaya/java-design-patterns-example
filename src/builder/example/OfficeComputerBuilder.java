package builder.example;

/**
 * オフィスPC用のビルダー
 */
public class OfficeComputerBuilder implements ComputerBuilder {
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
    // オフィスPC用のデフォルト値を設定
    if (cpu == null)
      cpu = "Intel Core i5-13400";
    if (ram == null)
      ram = "16GB DDR4";
    if (storage == null)
      storage = "512GB SSD";
    if (gpu == null)
      gpu = "Intel UHD Graphics";
    if (motherboard == null)
      motherboard = "ASUS Prime B660";
    if (powerSupply == null)
      powerSupply = "450W 80+ Bronze";
    if (caseType == null)
      caseType = "Fractal Design Define C";

    return new Computer(cpu, ram, storage, gpu, motherboard, powerSupply, caseType);
  }
}