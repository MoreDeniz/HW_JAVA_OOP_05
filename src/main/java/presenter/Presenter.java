package presenter;

import model.Notebook;
import ui.Console;
import ui.View;

import static java.lang.System.exit;

public class Presenter {
    private View view;
    private Notebook notebook;
    private Console console;

    public Presenter(View view, Notebook notebook){
        this.view = view;
        this.notebook = notebook;
        this.console = new Console();
        view.setPresenter(this);
    }

    public void buttonClick(int number) throws Exception {

            switch (number) {
                case 1:
                    String note = console.getNote();
                    notebook.addEntry(note);
                    break;
                case 2:
                    notebook.showEntry();
                    break;
                case 0:
                    exit(0);
        }
    }

    public void back() throws Exception {
        view.start();
    }
}