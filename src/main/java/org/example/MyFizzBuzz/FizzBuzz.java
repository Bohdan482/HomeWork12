package org.example.MyFizzBuzz;

import java.util.List;

public class FizzBuzz {
    public void fizzBuzz(int number, List<String> numbers) throws InterruptedException {
        Thread thread = new Thread(()->{
           if (number%15 == 0){
               numbers.add("FizzBuzz");
           }
        });
        Thread.sleep(10);
        thread.start();
    }
}
