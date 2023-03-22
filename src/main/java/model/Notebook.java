package notebook;

import presenter.Presenter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Note{

    private String note;
    private Scanner scanner;
    private Presenter presenter;
    private static StringBuilder sb;

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public Notebook() throws Exception{
        scanner = new Scanner(System.in);
        this.sb = new StringBuilder();
        readFile();
    }

    public void menu(int number) throws Exception {
        start(number);
    }

    public void start(int number) throws Exception {
        if (number == 1){
            addNote();
        }
        if (number == 2){
            readNotes();
        }
    }

    private void addNote() throws Exception {
        System.out.println("Введите текст: \n");
        note = scanner.nextLine();
        sb.append(note + "\n");
        readFile();
        back();
    }

    private void readNotes() throws IOException{
        System.out.println(sb.toString());
        back();
    }

    private void back() throws IOException{
        System.out.println(sb.toString());
        back();
    }

    public void readFile() throws Exception{
        FileReader fr = new FileReader("notebook.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()){
            sb.append(scan.nextLine() + "\n");
        }
        fr.close();
    }

    private void recordFile(String note) throws IOException{
        FileWriter fw = new FileWriter("notebook.txt", true);
        fw.write(note + "\n");
        fw.close();
    }
}
