import java.util.ArrayList;

public class Presenter {
    //    private View view;
    private View view;
    private Model model;

    public Presenter(View v, Model m){
//        this.view = view;
//        view.setPresenter(this);
        model = m;
        view = v;
    }

    public void buttonClick() {
//    public void getNote(String note) {
        String note = view.getNote("- ");
        model.setNote(note);
        ArrayList allNotes = model.allNotes();
        view.print(allNotes, " - ");
    }
}