package org.example.FizzBuzz;

import java.util.function.IntConsumer;

public class FizzBuzz {
    private final int n;
    private int i;

    public FizzBuzz(int n) {
        this.n = n;
        this.i = 1;
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (this) {
            while (i<=n) {
                if (i%3==0 && i%5!=0) {
                    printFizz.run();
                    i+=1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (this) {
            while (i<=n) {
                if (i%3!=0 && i%5==0) {
                    printBuzz.run();
                    i+=1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (this) {
            while (i<=n) {
                if (i%15==0) {
                    printFizzBuzz.run();
                    i+=1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (i<=n) {
                if (i%3!=0 && i%5!=0) {
                    printNumber.accept(i);
                    i+=1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }
}
