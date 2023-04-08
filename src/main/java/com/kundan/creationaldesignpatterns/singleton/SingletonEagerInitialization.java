package com.kundan.creationaldesignpatterns.singleton;
public class SingletonEagerInitialization {
    //Static variable reference of single_instance of type Singleton
    private static final SingletonEagerInitialization single_instance =
            new SingletonEagerInitialization();
     //private constructor so that preventing instance creation from other class
    private SingletonEagerInitialization() {
    }
    /**
     * This method has global access to return Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonEagerInitialization getInstance() {

        return single_instance;
    }

}
