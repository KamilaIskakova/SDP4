package part2;

public class MementoShowcase {
    public void showcase() {
        TextEditor editor = new TextEditor();
        History history = new History();

        System.out.println("Adding \"Kamila \" to the file");
        editor.type("Kamila ");
        history.save(editor.save());

        System.out.println("Adding \"Iskakova\" to the file");
        editor.type("Iskakova");
        history.save(editor.save());

        System.out.println("Current text: " + editor.getText());

        System.out.println("Performing undo operation");
        editor.restore(history.undo());
        System.out.println("Current text after undo: " + editor.getText());
    }
}