package Generics.ListOfArgumentsWithVarargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TodoListVA {

    private final List<String> todoList = new ArrayList<>();

    public void addTasks(String... tasks) {
        Collections.addAll(todoList, tasks);
    }

    public void printTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No tasks on the list");
        } else {
            System.out.println("TODO LIST:");
            todoList.forEach(task -> System.out.println("- " + task));
        }
    }
}
