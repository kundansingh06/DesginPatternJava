package com.kundan.creationaldesignpatterns.singleton;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SingletonLazyInitDoubleCheckLocking_Main {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        SingletonLazyInitDoubleCheckLocking_MyThread myThread = new SingletonLazyInitDoubleCheckLocking_MyThread();
        try {
            executorService = Executors.newFixedThreadPool(5);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null)
                executorService.shutdown();
        }
    }
}
