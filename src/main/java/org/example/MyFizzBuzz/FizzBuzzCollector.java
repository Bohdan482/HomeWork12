package org.example.MyFizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzCollector {
    public List<String> collect (int number) throws InterruptedException {
            Fizz fizz = new Fizz();
            Buzz buzz = new Buzz();
            FizzBuzz fizzBuzz = new FizzBuzz();
            LeaveNumber leaveNumber = new LeaveNumber();

       List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            numbers.add(i);
        }

        List<String> result = new ArrayList<>();

        for (Integer num : numbers) {
                fizz.fizz(num, result);
                buzz.buzz(num, result);
                fizzBuzz.fizzBuzz(num, result);
                leaveNumber.leave(num, result);
            }
        return result;
    }
}
