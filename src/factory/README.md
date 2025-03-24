## Java ファクトリメソッドパターン実装例

ここでは Java におけるファクトリデザインパターンの様々な実装方法を示すサンプルコードを提供します。

## ファクトリメソッドパターンとは

Factory Method パターンは、オブジェクトの生成をサブクラスに委譲するデザインパターンです。このパターンを使用することで、オブジェクトの生成と使用を分離し、コードの柔軟性と拡張性を向上させることができます。

## 目的

オブジェクトの生成をサブクラスに委ね、柔軟性を高める

## メリット・デメリット

**メリット**

- 依存関係を減らせる (クライアントが`new`しない)
- 変更に強い (新しい製品が追加しやすい)
- コードの再利用性が向上
  **デメリット**
- クラスが増えて、実装が複雑になりやすい

## 主なユースケース

1. **データベース接続 (JDBC)**

   異なるデータベース (MySQL, PostgreSQL, SQLite など) に対して共通のインターフェースを提供する

   - `DriverManager.getConnection(url)` で DB 接続を取得する仕組みが Factory Method パターン
   - `getConnection()` の実装は、URL に応じて適切な Connection オブジェクトを返す
   - `Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb");`

2. **ログ出力 (Logger)**

   異なるログ出力形式 (コンソール, ファイル, データベース) を統一的に管理

   - `LoggerFactory.getLogger()` を使い、ログの出力先を切り替える
   - `Logger logger = LoggerFactory.getLogger("console"); logger.log("ログメッセージ");`

3. **Web フレームワーク (Spring, Django, Rails など)**

   HTTP リクエストを処理するコントローラーの生成

   - `ControllerFactory` が適切なコントローラー (`UserController`, `ProductController`) を生成

4. **GUI コンポーネントの作成**

   異なる UI フレームワーク (Swing, JavaFX, Android) に適用

   - `ButtonFactory.createButton()` で OS に応じたボタンを作成 (`WindowsButton`, `MacButton`)

5. **依存性の注入**

   - テスト用のモックオブジェクトの生成
   - 異なる実装の切り替え

6. **複雑なオブジェクトの生成**
   - 設定に基づくオブジェクトの生成
   - 段階的なオブジェクトの構築

## 実装例の説明

このプロジェクトでは、以下のような構造で Factory Method パターンを実装しています：

1. **Product（製品）**

   - `Product`: 抽象クラス
   - `ConcreteProductA`, `ConcreteProductB`: 具体的な製品クラス

2. **Creator（生成者）**

   - `Creator`: 抽象クラス
   - `ConcreteCreator`: 具体的な生成者クラス

3. **デモ**
   - `FactoryMethodDemo`: パターンの使用例を示すデモクラス

## よくある質問（FAQ）

Q: **Factory Method パターンと Simple Factory の違いは？**

A: Factory Method パターンは継承を使用してオブジェクトの生成をサブクラスに委譲しますが、Simple Factory は単一のクラスで全てのオブジェクト生成を担当します。Factory Method パターンの方が拡張性が高く、Open-Closed Principle に従っています。

Q: **いつ Factory Method パターンを使用すべきか？**

A: 以下のような場合に使用することを推奨します：

- オブジェクトの生成ロジックが複雑な場合
- 将来的に新しい種類のオブジェクトを追加する可能性がある場合
- オブジェクトの生成と使用を分離したい場合

Q: **Factory Method パターンのデメリットは？**

A: 主なデメリットは以下の通りです：

- クラスの数が増える
- コードの複雑性が増す
- シンプルなオブジェクト生成には過剰な場合がある

Q: **テンプレートメソッドパターンとの関係は？**

A: Factory Method パターンは、テンプレートメソッドパターンの特殊なケースと見なすことができます。Creator クラスの`useProduct`メソッドがテンプレートメソッドとして機能し、その中で`createProduct`という抽象メソッドを呼び出します。
