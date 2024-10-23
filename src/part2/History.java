package part2;

import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<>();
    public void save(Memento memento) {
        history.push(memento);
    }
    public Memento undo() {
        if (history.isEmpty()) {
            return null;
        }
        history.pop();
        return history.isEmpty() ? null : history.peek();
    }
}