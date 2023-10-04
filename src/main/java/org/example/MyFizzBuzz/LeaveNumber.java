package org.example.MyFizzBuzz;

import java.util.List;

public class LeaveNumber {
    public void leave(int number, List<String> numbers){
        Thread thread = new Thread(()->{
            if (number%3 != 0 && number%5 != 0){
                numbers.add(String.valueOf(number));
            }
        });
        thread.start();
    }
}
