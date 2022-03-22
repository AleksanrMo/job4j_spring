package ru.job4j.di;
public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    private void add(String value) {
        store.add(value);
    }

    public void getInput(String st) {
        add(consoleInput.askStr(st));
    }
    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
