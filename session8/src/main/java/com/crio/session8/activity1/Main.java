package com.crio.session8.activity1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterIncrementor incrementingThread = new CounterIncrementor(counter);
        CounterDecrementor decrementingThread = new CounterDecrementor(counter);

        incrementingThread.start();
        decrementingThread.start();

        incrementingThread.join();
        decrementingThread.join();

        System.out.println("Counter Total Count: " + counter.getCount());

    //     Counter counter2 = new Counter();
    //     CounterIncrementor incrementingThread2 = new CounterIncrementor(counter2);
    //     //CounterDecrementor decrementingThread2 = new CounterDecrementor(counter2);

    //     incrementingThread2.start();
    //    // decrementingThread2.start();

    //     incrementingThread2.join();
    //    // decrementingThread2.join();

    //     System.out.println("Counter Total Count: " + counter2.getCount());

        // StaticCounterIncrementor staticIncrementingThread = new StaticCounterIncrementor();
        // StaticCounterDecrementor staticDecrementingThread = new StaticCounterDecrementor();

        // staticIncrementingThread.start();
        // staticDecrementingThread.start();

        // staticIncrementingThread.join();
        // staticDecrementingThread.join();

        // System.out.println("Static Counter Total Count: " + StaticCounter.getCount());

    }
}
