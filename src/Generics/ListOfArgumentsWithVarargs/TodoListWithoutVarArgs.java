package Generics.ListOfArgumentsWithVarargs;

public class TodoListWithoutVarArgs {
    public static void main(String[] args) {
        TodoListVA todoList = new TodoListVA();

        todoList.addTasks("Estudar Java", "Fazer exercícios", "Ler um livro");
        todoList.addTasks("Praticar programação", "Descansar");

        todoList.printTasks();
    }
}
