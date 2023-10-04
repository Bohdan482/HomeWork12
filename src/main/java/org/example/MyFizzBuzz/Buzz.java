package org.example.MyFizzBuzz;

import java.util.List;

public class Buzz {
    public void buzz(int number, List<String> numbers) throws InterruptedException {
        Thread thread = new Thread(()->{
           if (number%5 ==0 && number%3 != 0){
               numbers.add("Buzz");
           }
        });
        Thread.sleep(10);
        thread.start();
    }
}
