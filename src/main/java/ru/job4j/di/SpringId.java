package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringId {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.getInput("Введите свое имя:");
        ui.print();
    }
}
