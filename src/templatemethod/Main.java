package templatemethod;

import templatemethod.example.*;

public class Main {
  public static void main(String[] args) {
    // コーヒーを淹れる
    System.out.println("コーヒーを淹れます:");
    Beverage coffee = new Coffee();
    coffee.prepare();
    
    // 紅茶を淹れる
    System.out.println("\n紅茶を淹れます:");
    Beverage tea = new Tea();
    tea.prepare();
  }
} 