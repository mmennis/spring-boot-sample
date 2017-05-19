package hello;

import org.joda.time.LocalTime;

/**
 * Initial test file - main method deactiviated
 * Created by michaelmennis on 5/19/17.
 */
public class HelloWorld {

  public static void fakeMain(String [] args) {

    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
