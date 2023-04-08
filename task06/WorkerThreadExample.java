import java.util.LinkedList;
import java.util.Queue;

public class WorkerThreadExample {
    private final Queue<Runnable> taskQueue = new LinkedList<>();
    private final Thread workerThread;
    private volatile boolean isStopped;

    public WorkerThreadExample() {
        workerThread = new Thread(() -> {
            while (!isStopped) {
                synchronized (taskQueue) {
                    while (taskQueue.isEmpty() && !isStopped) {
                        try {
                            taskQueue.wait();
                        } catch (InterruptedException e) {
                            // ignore
                        }
                    }
                    if (!taskQueue.isEmpty()) {
                        taskQueue.poll().run();
                    }
                }
            }
        });
        workerThread.start();
    }

    public void execute(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.offer(task);
            taskQueue.notify();
        }
    }

    public void stop() {
        isStopped = true;
        synchronized (taskQueue) {
            taskQueue.notifyAll();
        }
    }
}
