package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import presenter.Presenter;

public class Notebook implements Model{
    List<String> entries = new ArrayList<>();
    private String text;

    public void addEntry(String text){
        entries.add(text);

    }
    @Override
    public String toString(){
        return String.join("\n", entries);
    }
    public void showEntry(){
        for (String e : entries){
            System.out.println(e);
        }
    }

    @Override
    public void setNote(String text) {
        String note = text;
    }
}
