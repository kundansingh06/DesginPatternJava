package com.kundan.creationaldesignpatterns.singleton;
public class SingletonLazyInitSynchronized_Main {
    public static void main(String[] args) {
        /**
         * Calling getInstance() method many times returns same hashcode that proves that
         * Singleton class creates only one instance
         */
        SingletonLazyInitSynchronized x = SingletonLazyInitSynchronized.getInstance();
        SingletonLazyInitSynchronized y = SingletonLazyInitSynchronized.getInstance();
        SingletonLazyInitSynchronized z = SingletonLazyInitSynchronized.getInstance();
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

    }
}

