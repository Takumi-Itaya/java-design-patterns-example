package bridge.example;

public class DrawingAPI2 implements DrawingAPI {
  @Override
  public void drawCircle(double x, double y, double radius) {
    System.out.printf("API2.circle at (%f,%f) radius %f%n", x, y, radius);
  }

  @Override
  public void drawRectangle(double x1, double y1, double x2, double y2) {
    System.out.printf("API2.rectangle at (%f,%f) to (%f,%f)%n", x1, y1, x2, y2);
  }
}