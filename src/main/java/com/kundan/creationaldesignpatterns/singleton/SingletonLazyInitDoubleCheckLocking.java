package com.kundan.creationaldesignpatterns.singleton;
public class SingletonLazyInitDoubleCheckLocking {
    //Static variable reference of single_instance of type Singleton
    private static SingletonLazyInitDoubleCheckLocking single_instance = null;
    private SingletonLazyInitDoubleCheckLocking() {
    }
    public static SingletonLazyInitDoubleCheckLocking getInstance() {
        if (single_instance == null) {
            synchronized (SingletonLazyInitDoubleCheckLocking.class) {
                if (single_instance == null) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    single_instance = new SingletonLazyInitDoubleCheckLocking();
                }

            }
        }
        return single_instance;
    }
}
