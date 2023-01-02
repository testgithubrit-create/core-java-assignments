package Assignment3;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPEL {
  public static void main(String[] args) {

    ExpressionParser parser = new SpelExpressionParser();

    Expression exp = parser.parseExpression("'Hello SPEL'");
    String message = (String) exp.getValue();
    System.out.println(message);
    // OR
    // System.out.println(parser.parseExpression("'Hello SPEL'").getValue
  }
}
