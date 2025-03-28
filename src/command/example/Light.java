package command.example;

public class Light {
  private boolean isOn = false;
  
  public void turnOn() {
    isOn = true;
    System.out.println("ライトがオンになりました");
  }
  
  public void turnOff() {
    isOn = false;
    System.out.println("ライトがオフになりました");
  }
  
  public boolean isOn() {
    return isOn;
  }
} 