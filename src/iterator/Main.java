package iterator;

import iterator.example.*;

public class Main {
  public static void main(String[] args) {
    // コレクションを作成
    NameRepository namesRepository = new NameRepository();

    // イテレーターを使用してコレクションを巡回
    for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
      String name = (String) iter.next();
      System.out.println("名前: " + name);
    }
  }
} 