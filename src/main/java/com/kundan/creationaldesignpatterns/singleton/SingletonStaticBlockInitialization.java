package com.kundan.creationaldesignpatterns.singleton;
public class SingletonStaticBlockInitialization {
    //Static variable reference of single_instance of type Singleton
    private static SingletonStaticBlockInitialization single_instance = null;
    /*
     * private constructor so that preventing instance creation from other class
     */
    private SingletonStaticBlockInitialization() {
    }
    static {
        try {
            if(single_instance == null) {
                single_instance = new SingletonStaticBlockInitialization();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method has global access to return Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonStaticBlockInitialization getInstance() {
        return single_instance;
    }
}
