package com.kundan.creationaldesignpatterns.singleton;
public class SingletonLazyInitDoubleCheckLocking_MyThread implements Runnable {
    @Override
    public void run() {
        SingletonLazyInitDoubleCheckLocking singleton  = SingletonLazyInitDoubleCheckLocking.getInstance();
        //SingletonLazyInit singleton=SingletonLazyInit.getInstance();
        //SingletonLazyInitSynchronized singleton=SingletonLazyInitSynchronized.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+singleton.hashCode());
    }
}
