package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;

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
