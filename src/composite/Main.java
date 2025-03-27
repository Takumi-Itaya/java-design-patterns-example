package composite;

import composite.example.*;

public class Main {
  public static void main(String[] args) {
    // ルートディレクトリの作成
    Directory root = new Directory("root");

    // ファイルの作成
    File file1 = new File("file1.txt", 100);
    File file2 = new File("file2.txt", 200);

    // サブディレクトリの作成
    Directory subDir = new Directory("subdir");
    File file3 = new File("file3.txt", 300);

    // ディレクトリ構造の構築
    root.add(file1);
    root.add(file2);
    subDir.add(file3);
    root.add(subDir);

    // ディレクトリ構造の表示
    root.print("");
  }
}