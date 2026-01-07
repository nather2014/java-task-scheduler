package scheduler;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTaskScheduler implements TaskScheduler {

    private final Map<String,Task> tasks = new HashMap<>();

    @Override
    public void submit(Task task) {
        if(task==null) {
            new IllegalArgumentException("task cannot be null");
        }
        tasks.put(task.getId(), task);
    }

    @Override
    public boolean cancel(String taskId) {
        return tasks.remove(taskId)!=null;
    }
    
    
}
