package org.example.TimeMeasurer;

public class TimeMeasurer {
   public static void main(String[] args) throws InterruptedException {
      long startTime = System.currentTimeMillis();
      new Thread(() ->
      {
         while (true) {
            try {
               Thread.sleep(5000);
               System.out.println("Минуло 5 секунд");
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
         }
      }).start();

      while (true) {
         Thread.sleep(1000);
         long second = System.currentTimeMillis();
         System.out.println("It's been " + (second - startTime) / 1000L + " second(s) since the start of the program");
      }
   }
}
