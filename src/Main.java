import ru.gb.family_tree.model.writer.FIleHandler;
import ru.gb.family_tree.view.ConsoleUI;


public class Main {
    public static void main(String[] args) {

        ConsoleUI test = new ConsoleUI();
        test.setWritable(new FIleHandler());
        test.start();

    }
}