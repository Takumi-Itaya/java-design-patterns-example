package builder.example;

/**
 * パソコンビルダーのインターフェース
 */
public interface ComputerBuilder {
  ComputerBuilder setCPU(String cpu);

  ComputerBuilder setRAM(String ram);

  ComputerBuilder setStorage(String storage);

  ComputerBuilder setGPU(String gpu);

  ComputerBuilder setMotherboard(String motherboard);

  ComputerBuilder setPowerSupply(String powerSupply);

  ComputerBuilder setCase(String caseType);

  Computer build();
}