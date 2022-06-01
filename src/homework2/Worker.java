package homework2;

import homework2.interfaces.OnTaskDoneListener;
import homework2.interfaces.OnTaskErrorListener;

public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback,
                  OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            int taskError = 33;
            if (i == taskError) {
                errorCallback.onError("Task " + i + " is FALSE!");
            } else {
                callback.onDone("Task " + i + " is done!");
            }
        }
    }
}
