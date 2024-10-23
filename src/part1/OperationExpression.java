package part1;

public class OperationExpression implements Expression {
    private final Expression left;
    private final Expression right;
    private final char action;

    public OperationExpression(Expression left, Expression right, char operation) {
        this.left = left;
        this.right = right;
        this.action = operation; // Store the operation
    }

    @Override
    public int interpret() {
        switch (action) {
            case '+':
                return left.interpret() + right.interpret();
            case '-':
                return left.interpret() - right.interpret();
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + action);
        }
    }
}