package ui;

import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class Console implements View {
    // запрашиваем запись у пользователя и отправляем в presenter
    private Presenter presenter;
    private Scanner scanner;
    private Console console;

    public Console() {
        scanner = new Scanner(System.in);
        this.console = console;
    }
    // с каким презентером хотим работать
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    // начало работы приложения
    @Override
    public void start() throws Exception {
        int number = scan();
        presenter.buttonClick(number);
    }

    // сканируем ответ от пользователя
    private int scan() {
        System.out.println("Выберите действие: \n" +
                "1 - Внести запись в Notebook\n" +
                "2 - Просмотреть все записи\n" +
                "0 - Выход");
        int number = scanner.nextInt();
        return number;
    }

    // сканируем фразу от пользователя
    public String getNote() {
        System.out.println("Введите фразу: \n");
        String note = scanner.nextLine();
        return note;
    }

    // выводит в консоль инф из model
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
