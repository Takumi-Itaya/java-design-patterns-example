package interpreter;

import interpreter.example.*;

public class Main {
  public static void main(String[] args) {
    // 簡単な文法を解析するためのコンテキストを作成
    Context context = new Context();
    
    // 式を構築
    Expression expression = new AddExpression(
      new NumberExpression(5),
      new SubtractExpression(
        new NumberExpression(10),
        new NumberExpression(3)
      )
    );
    
    // 式を評価
    int result = expression.interpret(context);
    System.out.println("結果: " + result);
  }
} 