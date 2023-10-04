package org.example.MyFizzBuzz;

import java.util.List;

public class Fizz {
    public void fizz(int number, List<String> numbers) throws InterruptedException {
        Thread thread = new Thread(()->{
         if (number%3 ==0 && number%5 != 0) {
         numbers.add("Fizz");
         }
        });
        Thread.sleep(10);
        thread.start();
    }
}
