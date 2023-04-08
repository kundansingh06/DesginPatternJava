package com.kundan.creationaldesignpatterns.singleton;
public class SingletonLazyInit_Main {
    public static void main(String[] args) {
        /**
         * Calling getInstance() method many times returns same hashcode that proves that
         * Singleton class creates only one instance
         */
        SingletonLazyInit x = SingletonLazyInit.getInstance();
        SingletonLazyInit y = SingletonLazyInit.getInstance();
        SingletonLazyInit z = SingletonLazyInit.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

    }
}
