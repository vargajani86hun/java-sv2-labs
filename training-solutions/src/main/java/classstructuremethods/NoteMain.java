package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Jone Doe");
        note.setTopic("shoping list");
        note.setText("milk, bread, eggs, onion, meat, pasta");

        System.out.println(note.getNoteText());
    }
}
