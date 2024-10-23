package part1;

public class InterpreterShowcase {
    public void showcase() {
        Interpreter interpreter = new Interpreter();

        String t1 = "5 + 2 - 3";
        String t2 = "1 + 2 + 3";
        String t3 = "100 - 50 - 15";

        System.out.println(t1 + ": " + interpreter.interpret(t1));
        System.out.println(t2 + ": " + interpreter.interpret(t2));
        System.out.println(t3 + ": " + interpreter.interpret(t3));
    }
}