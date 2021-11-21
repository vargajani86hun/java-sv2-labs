package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    private List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String toDoElement;
        ToDo toDo = new ToDo();

        System.out.println("Adja meg egyesével teendőit (todo). " +
                "Kilépés az 'x' karakterrel.");
        while (!("x".equals(toDoElement = sc.nextLine()))) {
            toDo.addElement(toDoElement);
        }

        try {
            toDo.writeListToFile(Paths.get("todos.txt"));
            System.out.println("Teendői listája sikeresen el lett mentve a " +
                    "todos.txt nevű állományba.");
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.getCause().printStackTrace();
        }
    }

    private void addElement(String element) {
        toDoList.add(element);
    }

    private void writeListToFile(Path path) {
        try {
            Files.write(path, toDoList);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to create file!", ioe);
        }
    }
}
