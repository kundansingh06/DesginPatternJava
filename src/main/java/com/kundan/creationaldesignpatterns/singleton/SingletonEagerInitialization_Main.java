package com.kundan.creationaldesignpatterns.singleton;

public class SingletonEagerInitialization_Main {
    public static void main(String[] args) {
        /**
         * Calling getInstance() method many times returns same hashcode that proves that
         * Singleton class creates only one instance
         */
        SingletonEagerInitialization x = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization y = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization z = SingletonEagerInitialization.getInstance();
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

    }
}
