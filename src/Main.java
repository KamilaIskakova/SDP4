import part1.InterpreterShowcase;
import part2.MementoShowcase;
import part3.ObserverShowcase;

public class Main {
    public static void main(String[] args) {
        InterpreterShowcase interpreterShowcase = new InterpreterShowcase();
        interpreterShowcase.showcase();

        MementoShowcase mementoShowcase = new MementoShowcase();
        mementoShowcase.showcase();

        ObserverShowcase observerShowcase = new ObserverShowcase();
        observerShowcase.showcase();
    }
}