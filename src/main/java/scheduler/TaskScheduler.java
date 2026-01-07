package scheduler;

public interface TaskScheduler {
   void submit(Task task);
   boolean cancel(String taskId); 
}
