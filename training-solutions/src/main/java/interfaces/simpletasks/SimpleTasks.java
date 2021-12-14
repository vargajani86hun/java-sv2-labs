package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

    private List<String> tasks = new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (nextStep());
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    private boolean nextStep() {
        if (tasks == null || tasks.isEmpty()) {
            return false;
        }
        int lastIndex = tasks.size()-1;
        tasks.remove(lastIndex);
        return true;
    }
}
