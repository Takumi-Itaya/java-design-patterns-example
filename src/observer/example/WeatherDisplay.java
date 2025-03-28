package observer.example;

public class WeatherDisplay implements Observer {
  private String name;
  
  public WeatherDisplay(String name) {
    this.name = name;
  }
  
  @Override
  public void update(float temperature, float humidity, float pressure) {
    System.out.println(name + "が更新:");
    System.out.println("温度: " + temperature + "°C");
    System.out.println("湿度: " + humidity + "%");
    System.out.println("気圧: " + pressure + "hPa");
    System.out.println();
  }
} 