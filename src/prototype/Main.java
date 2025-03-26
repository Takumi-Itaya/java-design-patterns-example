package prototype;

import prototype.example.Document;

public class Main {
  public static void main(String[] args) {
    // プロトタイプの作成
    Document originalDocument = new Document("オリジナルドキュメント", "これはオリジナルの内容です。");

    // クローンの作成
    Document clonedDocument = (Document) originalDocument.clone();

    // クローンの内容を変更
    clonedDocument.setTitle("クローンされたドキュメント");
    clonedDocument.setContent("これはクローンされた内容です。");

    // 結果の表示
    System.out.println("オリジナルドキュメント:");
    System.out.println("タイトル: " + originalDocument.getTitle());
    System.out.println("内容: " + originalDocument.getContent());
    System.out.println();

    System.out.println("クローンされたドキュメント:");
    System.out.println("タイトル: " + clonedDocument.getTitle());
    System.out.println("内容: " + clonedDocument.getContent());
  }
}