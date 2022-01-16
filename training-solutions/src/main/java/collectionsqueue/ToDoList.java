package collectionsqueue;

import java.util.*;

public class ToDoList {
    private List<ToDo> toDos;

    public ToDoList(List<ToDo> toDos) {
        this.toDos = toDos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> results = new ArrayDeque<>();
        for (ToDo td: toDos) {
            if(td.isUrgent()) {
                results.addFirst(td);
            } else {
                results.addLast(td);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList(Arrays.asList(new ToDo("Tankolás", false),
                new ToDo("telefon feltöltése", true), new ToDo("főzés", true),
                new ToDo("vasalás", false), new ToDo("mosás", true),
                new ToDo("mosogatás", false), new ToDo("kutya sétáltatás", true)));

        Deque<ToDo> sortedToDoList = toDoList.getTodosInUrgencyOrder();
        System.out.println(sortedToDoList);
        while (!sortedToDoList.isEmpty()) {
            System.out.println(sortedToDoList.pop());
            System.out.println(sortedToDoList);
        }
    }
}
