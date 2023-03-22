import model.Notebook;
import presenter.Presenter;
import ui.Console;
import ui.View;

public class Program {
    public static void main(String[] args) throws Exception {
        View view = new Console();
        Notebook notebook = new Notebook();
        new Presenter(view, notebook);

        while (true) {
            view.start();
        }
    }
}
