package observer;

import observer.example.*;

public class Main {
  public static void main(String[] args) {
    // 被監視オブジェクト（Subject）を作成
    WeatherStation weatherStation = new WeatherStation();
    
    // 監視者（Observer）を作成
    Observer display1 = new WeatherDisplay("ディスプレイ1");
    Observer display2 = new WeatherDisplay("ディスプレイ2");
    
    // 監視者を登録
    weatherStation.registerObserver(display1);
    weatherStation.registerObserver(display2);
    
    // 天気情報を更新
    System.out.println("天気情報を更新:");
    weatherStation.setMeasurements(25.0f, 65.0f, 1013.0f);
    
    // 1つの監視者を削除
    System.out.println("\nディスプレイ1を削除");
    weatherStation.removeObserver(display1);
    
    // 天気情報を再度更新
    System.out.println("\n天気情報を更新:");
    weatherStation.setMeasurements(28.0f, 70.0f, 1015.0f);
  }
} 