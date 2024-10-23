package part1;

import java.util.Stack;

public class Interpreter {
    public int interpret(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] expressions = expression.split(" ");

        for (int i = expressions.length - 1; i >= 0; i--) {
            if (!isOperation(expressions[i])) {
                stack.push(new NumberExpression(Integer.parseInt(expressions[i])));
            }
        }
        for (String exp : expressions) {
            if (isOperation(exp)) {
                Expression left = stack.pop();
                Expression right = stack.pop();
                Expression result = new OperationExpression(left, right, exp.charAt(0));
                stack.push(result);
            }
        }
        return stack.pop().interpret();
    }
    private boolean isOperation(String expression) {
        return "+".equals(expression) || "-".equals(expression);
    }
}