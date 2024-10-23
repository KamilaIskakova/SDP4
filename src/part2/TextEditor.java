package part2;

public class TextEditor {
    private StringBuilder currentText;
    public TextEditor() {
        currentText = new StringBuilder();
    }
    public void type(String newText) {
        currentText.append(newText);
    }
    public String getText() {
        return currentText.toString();
    }
    public Memento save() {
        return new Memento(currentText.toString());
    }
    public void restore(Memento memento) {
        currentText = new StringBuilder(memento.getState());
    }
}