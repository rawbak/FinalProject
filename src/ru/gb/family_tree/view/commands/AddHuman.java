package ru.gb.family_tree.view.commands;

import ru.gb.family_tree.view.ConsoleUI;

public class AddHuman extends Command {

    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить человека";
    }

    public void execute(){
        consoleUI.addNewHuman();
    }
}
