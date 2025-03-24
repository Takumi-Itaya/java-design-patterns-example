package singleton;

import singleton.example.EnumSingleton;
import singleton.example.Singleton;
import singleton.example.StaticInnerClassSingleton;
import singleton.example.ThreadSafeSingleton;

public class Main {
  public static void main(String[] args) {
    System.out.println("===== 基本的なシングルトン =====");
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    System.out.println("同一インスタンス: " + (singleton1 == singleton2));

    System.out.println("\n===== スレッドセーフなシングルトン =====");
    ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
    ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
    System.out.println("同一インスタンス: " + (threadSafeSingleton1 == threadSafeSingleton2));

    System.out.println("\n===== Enumを使用したシングルトン =====");
    EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
    EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
    enumSingleton1.showMessage();
    enumSingleton1.doSomething();
    System.out.println("同一インスタンス: " + (enumSingleton1 == enumSingleton2));

    System.out.println("\n===== 静的内部クラスを使用したシングルトン =====");
    StaticInnerClassSingleton staticInnerSingleton1 = StaticInnerClassSingleton.getInstance();
    StaticInnerClassSingleton staticInnerSingleton2 = StaticInnerClassSingleton.getInstance();
    staticInnerSingleton1.showMessage();
    staticInnerSingleton1.doSomething();
    System.out.println("同一インスタンス: " + (staticInnerSingleton1 == staticInnerSingleton2));
  }
}
