package com.kundan.creationaldesignpatterns.singleton;
public class SingletonLazyInitSynchronized {
    //Static variable reference of single_instance of type Singleton
    private static SingletonLazyInitSynchronized single_instance = null;
    /*
     * private constructor so that preventing instance creation from other class
     */
    private SingletonLazyInitSynchronized() {
    }
    /**
     * This method has global access to return Single instance within JVM
     * @return Singleton Instance
     */
    synchronized public static SingletonLazyInitSynchronized getInstance() {
        //If Instance is null then only instantiate
        if (single_instance == null) {
            single_instance = new SingletonLazyInitSynchronized();
        }
        return single_instance;
    }
}
