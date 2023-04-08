package com.kundan.creationaldesignpatterns.singleton;
public class SingletonLazyInit {
    //Static variable reference of single_instance of type Singleton
    private static SingletonLazyInit single_instance = null;
    /*
     * private constructor so that preventing instance creation from other class
     */
    private SingletonLazyInit() {
    }
    /**
     * This method has global access to return Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonLazyInit getInstance() {
        //If Instance is null then only instantiate
        if (single_instance == null) {
            single_instance = new SingletonLazyInit();
        }
        return single_instance;
    }
}
